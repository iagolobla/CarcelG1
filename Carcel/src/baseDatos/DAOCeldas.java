/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import carcel.Celda;
import carcel.Nivel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class DAOCeldas extends AbstractDAO{
    
    public DAOCeldas(Connection connection, carcel.FachadaCarcel fc) {
        super.setConnection(connection);
        super.setFachadaCarcel(fc);
    }
    
    public void insertarCelda(String nPlazas, String superficie, String seguridad){        
        Connection con;
        PreparedStatement query;
        
        String consulta = "INSERT INTO celda(";
        
        if(!superficie.isEmpty())   consulta += "superficie,";
        if(!nPlazas.isEmpty())  consulta += "numCamas,";
        //No es necesario hacer la comprobacion de null de seguridad ya que ese caso no es posible debido a que 
        //se utiliza un combobox
        consulta += "seguridad) VALUES (?";
        
        if(!superficie.isEmpty())   consulta += ",?";
        if(!nPlazas.isEmpty())  consulta += ",?";
        
        consulta += ");";
        
        con = super.getConnection();
        
        try{
            query = con.prepareStatement(consulta);
            
            //Logica de rellenado de campos
            if(!superficie.isEmpty()){
                query.setFloat(1, Float.parseFloat(superficie));
                if(!nPlazas.isEmpty()){
                    query.setInt(2, Integer.parseInt(nPlazas));
                    query.setString(3, seguridad);
                } else {
                    query.setString(2, seguridad);
                }
            } else {
                if(!nPlazas.isEmpty()){
                    query.setInt(1, Integer.parseInt(nPlazas));
                    query.setString(2, seguridad);
                } else {
                    query.setString(1, seguridad);
                }
            }
            
            query.execute();
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        }
    }
    
    public Celda obtenerCelda(String id){
        Celda celda = null;
        
        Connection con;
        
        PreparedStatement query = null;
        ResultSet rsCelda;
        
        String consulta =   "SELECT numCelda, superficie, numCamas, seguridad " +
                            "FROM celda c " +
                            "WHERE c.numCelda = ?";
        
        con = this.getConnection();
        
        try{
            query = con.prepareStatement(consulta);
            
            query.setInt(1, Integer.parseInt(id));
            
            rsCelda = query.executeQuery();
            
            while(rsCelda.next()){
                celda = new Celda(rsCelda.getInt("numCelda"), rsCelda.getFloat("superficie"), rsCelda.getInt("numCamas"), Nivel.valueOf(rsCelda.getString("seguridad")));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();   //Aprender funcionamiento
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
        }
        
        return celda;
    }
    
}
