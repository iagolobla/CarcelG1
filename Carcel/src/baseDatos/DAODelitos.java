/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import carcel.Delito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alumnogreibd
 */
public class DAODelitos extends AbstractDAO{
    public DAODelitos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    public void insertarDelito(Delito delito){
        /*Connection con;
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
        }*/
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
        } finally {
            try {
                stmPreso.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
}
