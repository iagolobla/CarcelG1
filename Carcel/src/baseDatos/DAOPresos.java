package baseDatos;

import carcel.Banda;
import carcel.Celda;
import carcel.Delito;
import carcel.Nivel;
import carcel.Preso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPresos extends AbstractDAO {

    public DAOPresos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }

    protected java.util.List<Preso> buscarPresos(String DNI, String nombre, String apodo) {
        java.util.List<Preso> presos = new ArrayList<Preso>();
        Connection con;
        PreparedStatement stmPreso = null;
        ResultSet rsPreso;

        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("SELECT dni, fechaIngreso, fechaSalida, nombre, fechaNacimiento, apodo, agresividad, banda, categoria, celda "
                    + "FROM preso "
                    + "WHERE dni LIKE ? AND nombre LIKE ? AND apodo LIKE ?");
            stmPreso.setString(1, "%" + DNI + "%");
            stmPreso.setString(2, "%" + nombre + "%");
            stmPreso.setString(3, "%" + apodo + "%");
            rsPreso = stmPreso.executeQuery();
            while (rsPreso.next()) {
                Banda banda = new Banda(rsPreso.getString("banda"));
                Celda celda = new Celda(rsPreso.getInt("celda"));
                Preso preso = new Preso(rsPreso.getString("dni"), rsPreso.getString("nombre"), rsPreso.getString("apodo"), rsPreso.getDate("fechaNacimiento"),
                        rsPreso.getDate("fechaIngreso"), rsPreso.getDate("fechaSalida"), banda, rsPreso.getString("categoria"), Nivel.valueOf(rsPreso.getString("agresividad")), celda);
                presos.add(preso);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmPreso.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return presos;
    }

    protected Boolean comprobarReincidente(String DNI) {
        Boolean resultado = false;
        Connection con;
        PreparedStatement stmPreso = null;
        ResultSet rsPreso;

        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("SELECT * "
                    + "FROM preso "
                    + "WHERE DNI=? AND fechaSalida IS NOT NULL");
            stmPreso.setString(1, DNI);
            rsPreso = stmPreso.executeQuery();
            if (rsPreso.next()) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmPreso.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    protected void insertarPresoNoReincidente(Preso preso) {
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("INSERT INTO preso(dni, fechaIngreso, fechaSalida, nombre, fechaNacimiento, apodo, agresividad, banda, "
                    + "categoria, celda "
                    + "VALUES (?, ?, null, ?, ?, ?, ?, ?, ?, ?)");
            stmPreso.setString(1, preso.getDNI());
            stmPreso.setString(2, preso.getFechaIngreso().toString());
            stmPreso.setString(3, preso.getNombre());
            stmPreso.setString(4, preso.getFechaNacimiento().toString());
            stmPreso.setString(5, preso.getApodo());
            stmPreso.setString(6, preso.getAgresividad().toString());
            stmPreso.setString(7, preso.getBanda().getTipo_banda());
            stmPreso.setString(8, preso.getCategoria());
            stmPreso.setInt(9, preso.getCelda().getnCelda());
            stmPreso.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmPreso.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    protected void insertarPresoReincidente(Preso preso) {
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("UPDATE preso "
                    + "SET dni=?, "
                    + "fechaIngreso=?, "
                    + "fechaSalida=null, "
                    + "nombre=?, "
                    + "fechaNacimiento=?, "
                    + "apodo=?, "
                    + "agresividad=?, "
                    + "banda=?, "
                    + "categoria=?, "
                    + "celda=?"
                    + "WHERE DNI=?");
            stmPreso.setString(1, preso.getDNI());
            stmPreso.setString(2, preso.getFechaIngreso().toString());
            stmPreso.setString(3, preso.getNombre());
            stmPreso.setString(4, preso.getFechaNacimiento().toString());
            stmPreso.setString(5, preso.getApodo());
            stmPreso.setString(6, preso.getAgresividad().toString());
            stmPreso.setString(7, preso.getDNI());
            stmPreso.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmPreso.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    protected void liberarPreso(String DNI) {
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("UPDATE preso "
                    + "SET fechaSalida=CURRENT_DATE, banda=NULL, celda=NULL "
                    + "WHERE DNI=?");
            stmPreso.setString(1, DNI);
            stmPreso.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmPreso.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public java.util.List<String> rellenarCampos(String tipo) {
        java.util.List<String> resultado = new java.util.ArrayList<>();
        Connection con;
        PreparedStatement stmRellenar = null;
        ResultSet rsRellenar;

        con = this.getConnection();
        String consulta = "select * "
                + "from delito LEFT JOIN cometerdelito ON nombre=delito "
                + "where nombre = ?";
        try {
            stmRellenar = con.prepareStatement(consulta);
            stmRellenar.setString(1, tipo);
            rsRellenar = stmRellenar.executeQuery();
            while (rsRellenar.next()) {
                resultado.add(rsRellenar.getString("nombre"));
                resultado.add(rsRellenar.getString("descripcion"));
                resultado.add(rsRellenar.getString("intensidad"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmRellenar.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    protected java.util.List<Delito> consultarCargosPreso(String DNI) {
        java.util.List<Delito> resultado = new java.util.ArrayList<>();
        Delito delitoActual;
        Connection con;
        PreparedStatement stmDelitos = null;
        ResultSet rsDelitos;

        con = this.getConnection();

        String consulta = "SELECT nombre, descripcion, intensidad "
                + "FROM delito JOIN cometerdelito ON nombre=delito "
                + "WHERE preso=?";
        try {
            stmDelitos = con.prepareStatement(consulta);
            stmDelitos.setString(1, DNI);
            rsDelitos = stmDelitos.executeQuery();
            while (rsDelitos.next()) {
                delitoActual = new Delito(rsDelitos.getString("nombre"),
                        rsDelitos.getString("descripcion"),
                        Nivel.valueOf(rsDelitos.getString("intensidad")));
                resultado.add(delitoActual);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmDelitos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public void asociarPreso(String DNI, Banda banda){
        Connection con;
        PreparedStatement stmAsociar = null;

        con = this.getConnection();

        String consulta = "update preso"
                + " set banda = ?"
                + " where dni = ?";
        try {
            stmAsociar = con.prepareStatement(consulta);
            stmAsociar.setString(1, banda.getTipo_banda());
            stmAsociar.setString(2, DNI);
            stmAsociar.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAsociar.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public void buscarPresosCelda(Celda celda){
        
    }
}
