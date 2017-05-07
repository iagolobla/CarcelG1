package baseDatos;

import carcel.Preso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPresos extends AbstractDAO {

    public DAOPresos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
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
}
