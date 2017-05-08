/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import carcel.Delito;
import carcel.Nivel;
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
        java.util.List<Delito> resultado = new java.util.ArrayList<>();
        Delito delitoActual;
        Connection con;
        PreparedStatement stmDelitos = null;
        ResultSet rsDelitos;

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
            //this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmDelitos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
}
