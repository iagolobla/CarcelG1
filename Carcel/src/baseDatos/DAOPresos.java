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
            stmPreso = con.prepareStatement("SELECT dni, fechaIngreso, fechaSalida, nombre, fechaNacimiento, apodo, agresividad, banda, celda "
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
                        rsPreso.getDate("fechaIngreso"), rsPreso.getDate("fechaSalida"), banda, Nivel.valueOf(rsPreso.getString("agresividad")), celda);
                presos.add(preso);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
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
                    + "WHERE DNI=?");
            stmPreso.setString(1, DNI);
            rsPreso = stmPreso.executeQuery();
            if (rsPreso.next()) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
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
                    + "celda) "
                    + "VALUES (?, ?, null, ?, ?, ?, ?, ?, ?);");
            stmPreso.setString(1, preso.getDNI());
            stmPreso.setDate(2, preso.getFechaIngreso());
            stmPreso.setString(3, preso.getNombre());
            stmPreso.setDate(4, preso.getFechaNacimiento());
            stmPreso.setString(5, preso.getApodo());
            stmPreso.setString(6, preso.getAgresividad().toString());
            if (preso.getBanda()!=null) {
                stmPreso.setString(7, preso.getBanda().getTipo_banda());

            } else {
                stmPreso.setNull(7, java.sql.Types.VARCHAR);
            }
            if (preso.getCelda() != null) {
                stmPreso.setInt(8, preso.getCelda().getnCelda());
            } else {
                stmPreso.setNull(8, java.sql.Types.INTEGER);
            }
            stmPreso.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
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
                    + "celda=?"
                    + "WHERE DNI=?");
            stmPreso.setString(1, preso.getDNI());
            stmPreso.setDate(2, preso.getFechaIngreso());
            stmPreso.setString(3, preso.getNombre());
            stmPreso.setDate(4, preso.getFechaNacimiento());
            stmPreso.setString(5, preso.getApodo());
            stmPreso.setString(6, preso.getAgresividad().toString());
            stmPreso.setString(7, preso.getBanda().getTipo_banda());
            stmPreso.setInt(8, preso.getCelda().getnCelda());
            stmPreso.setString(9, preso.getDNI());
            stmPreso.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
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
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
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
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
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
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmDelitos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void asociarPreso(String DNI, Banda banda) {
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
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAsociar.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void desasociarPreso(String dni) {
        Connection con;
        PreparedStatement stmAsociar = null;

        con = this.getConnection();

        String consulta = "update preso"
                + " set banda = null"
                + " where dni = ?";
        try {
            stmAsociar = con.prepareStatement(consulta);
            //stmAsociar.setString(1, banda.getTipo_banda());
            stmAsociar.setString(1, dni);
            stmAsociar.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmAsociar.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    protected java.util.List<Banda> obtenerBanda(String tipo) {
        java.util.List<Banda> bandas = new java.util.ArrayList<Banda>();
        Connection con;
        PreparedStatement stmBandas = null;
        ResultSet rsBandas;

        con = super.getConnection();

        try {
            stmBandas = con.prepareStatement("SELECT tipo, numPresos "
                    + "FROM banda "
                    + "WHERE tipo LIKE ? ");
            stmBandas.setString(1, "%" + tipo + "%");
            rsBandas = stmBandas.executeQuery();
            while (rsBandas.next()) {
                bandas.add(new Banda(rsBandas.getString("tipo"), rsBandas.getInt("numPresos")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmBandas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return bandas;
    }

    public ArrayList<Preso> buscarPresosCelda(Celda celda) {
        ArrayList<Preso> presos = new ArrayList<>();
        Preso auxPreso;
        
        Connection con;
        PreparedStatement query=null;
        ResultSet rsPresos;
        
        String consulta = "SELECT * FROM preso WHERE celda = ?";
        
        con = this.getConnection();
         try{
             query = con.prepareStatement(consulta);
             
             query.setInt(1, celda.getnCelda());
             
             rsPresos = query.executeQuery();
             
             while(rsPresos.next()){
                 auxPreso = new Preso(  rsPresos.getString("DNI"), rsPresos.getString("nombre"), rsPresos.getString("apodo"),
                                        rsPresos.getDate("fechaNacimiento"), rsPresos.getDate("fechaIngreso"), rsPresos.getDate("fechaSalida"),
                                        new Banda(rsPresos.getString("banda")), Nivel.valueOf(rsPresos.getString("agresividad")),
                                        new Celda(celda.getnCelda()));
                 presos.add(auxPreso);
             }
         } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();   
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
        }
         return presos;
    }
    
    //Con query (Consulta1) desligamos al preso 2 de su celda
    //Con query2 (Consulta2) ligamos el preso 1 a la antigua celda del preso 2
    //Con query3 (Consulta2) ligamos el preso 2 a la antigua celda del preso 1
    //Esta complicacion se hace para evitar problemas en caso de que ambas celdas estuviesen llenas
    public void intercambiarPresos(Preso preso1, Preso preso2){
        Connection con;
        PreparedStatement query = null;
        PreparedStatement query2 = null;
        PreparedStatement query3 = null;
        
        String consulta1 = "UPDATE preso SET celda = NULL WHERE DNI = ?";
        String consulta2 = "UPDATE preso SET celda = ? WHERE DNI = ?";
        
        con = this.getConnection();
        
        try{
            query = con.prepareStatement(consulta1);
            query2 = con.prepareStatement(consulta2);
            query3 = con.prepareStatement(consulta2);
            
            query.setString(1, preso2.getDNI());
            //Preso 1 a la celda 2
            query2.setInt(1, preso2.getCelda().getnCelda());
            query2.setString(2, preso1.getDNI());
            //Preso 2 a la celda 1
            query3.setInt(1, preso1.getCelda().getnCelda());
            query3.setString(2, preso2.getDNI());
            
            query.execute();
            query2.execute();
            query3.execute();
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();   
                query2.close();
                query3.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
        }
    }
}
