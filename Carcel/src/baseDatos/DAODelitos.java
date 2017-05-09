package baseDatos;

import carcel.Delito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAODelitos extends AbstractDAO{
    public DAODelitos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    public void insertarDelito(Delito delito){
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("INSERT INTO delito(nombre) "
                    + "VALUES (?)");
            stmPreso.setString(1, delito.getTipo_delito());
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
    
    public Boolean comprobarDelito(Delito delito){
        Boolean resultado = false;
        Connection con;
        PreparedStatement stmPreso = null;
        ResultSet rsPreso;

        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("SELECT * "
                    + "FROM delito "
                    + "WHERE nombre=?");
            stmPreso.setString(1, delito.getTipo_delito());
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
    
    public void insertarCargo(String dni, Delito delito){
        Connection con;
        PreparedStatement stmDelitos = null;

        con = this.getConnection();

        String consulta = "INSERT INTO cometerDelito(delito, preso, descripcion, intensidad) "
                + "VALUES (?,?,?,?)";
        try {
            stmDelitos = con.prepareStatement(consulta);
            stmDelitos.setString(1, delito.getTipo_delito());
            stmDelitos.setString(2, dni);
            stmDelitos.setString(3, delito.getDescripcion());
            stmDelitos.setString(4, delito.getIntensidad().toString());
            stmDelitos.executeUpdate();

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
    }
    
    public Boolean comprobarCargo(String dni, Delito delito){
        Boolean resultado = false;
        Connection con;
        PreparedStatement stmDelito = null;
        ResultSet rsDelito;
        
        con = super.getConnection();

        try {
            stmDelito = con.prepareStatement("SELECT * "
                    + "FROM cometerDelito "
                    + "WHERE delito = ? AND preso = ?");
            stmDelito.setString(1, delito.getTipo_delito());
            stmDelito.setString(2, dni);
            rsDelito = stmDelito.executeQuery();
            if (rsDelito.next()) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmDelito.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public void modificarCargo(String dni, Delito delito){
        Connection con;
        PreparedStatement stmDelitos = null;

        con = this.getConnection();

        String consulta = "UPDATE cometerDelito "
                + "SET descripcion = ?, intensidad = ? "
                + "WHERE preso = ? AND delito = ?";
        try {
            stmDelitos = con.prepareStatement(consulta);
            stmDelitos.setString(1, delito.getDescripcion());
            stmDelitos.setString(2, delito.getIntensidad().toString());
            stmDelitos.setString(3, dni);
            stmDelitos.setString(4, delito.getTipo_delito());
            stmDelitos.executeUpdate();

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
    }
    
    public void eliminarCargo(String dni, Delito delito){
        Connection con;
        PreparedStatement stmDelitos = null;

        con = this.getConnection();

        String consulta = "DELETE FROM cometerDelito "
                + "WHERE preso = ? AND delito = ?";
        try {
            stmDelitos = con.prepareStatement(consulta);
            stmDelitos.setString(1, dni);
            stmDelitos.setString(2, delito.getTipo_delito());
            stmDelitos.executeUpdate();

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
    }
}
