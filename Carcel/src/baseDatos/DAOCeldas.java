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
import java.util.ArrayList;

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
        PreparedStatement query=null;
        
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
        } finally {
            try {
                query.close();   //Aprender funcionamiento
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
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
    
    public ArrayList<Celda> buscarCelda(String id, String nPlazas, String seguridad){
        Connection con;
        ArrayList<Celda> celdas = new ArrayList<>();
        Celda auxCell = null;
        
        //Variables para guardar el orden de cada parametro en la consulta
        int oId, oNPlazas, oSeguridad;
        
        PreparedStatement query = null;
        ResultSet rsCeldas;
        
        String Consulta = "SELECT * FROM celda c ";
        
        //Si algun parametro tiene algo
        if(!(id.isEmpty() && nPlazas.isEmpty() && seguridad.isEmpty())){
            Consulta += "WHERE ";
        }
        
        //La construccion selectiva de la consulta la hago de esta forma debido a que no tendria sentido utilizar
        //like %% ya que si introducimos una id, queremos que nos salgan solo las celdas de esa id, pasa lo mismo
        //con el numero de plazas y la seguridad. Por tanto, para ofrecer flexibilidad de consultas pudiendo 
        //introducir los parametros de busqueda libremente, debe realizarse asi.
        if(!id.isEmpty()){
            Consulta += "numCelda = ? ";
            oId = 1;
            if(!nPlazas.isEmpty()){
                Consulta += "and numCamas = ? ";
                oNPlazas = 2;
                if(!seguridad.isEmpty()){
                    Consulta += "and seguridad = ?";
                    oSeguridad = 3;
                } else {
                    oSeguridad = 0;
                }
            } else {
                oNPlazas = 0;
                if(!seguridad.isEmpty()){
                    Consulta += "and seguridad = ?";
                    oSeguridad = 2;
                } else {
                    oSeguridad = 0;
                }
            }
        } else {
            oId = 0;
            if(!nPlazas.isEmpty()){
                Consulta += "numCamas = ? ";
                oNPlazas = 1;
                if(!seguridad.isEmpty()){
                    Consulta += "and seguridad = ?";
                    oSeguridad = 2;
                } else {
                    oSeguridad = 0;
                }
            } else {
                oNPlazas = 0;
                if(!seguridad.isEmpty()){
                    Consulta += "seguridad = ?";
                    oSeguridad = 1;
                } else {
                    oSeguridad = 0;
                }
            }
        }
        
        con = this.getConnection();
        
        try{
            query = con.prepareStatement(Consulta);
            
            if(oId != 0)    query.setInt(oId, Integer.parseInt(id));
            if(oNPlazas != 0)   query.setInt(oNPlazas, Integer.parseInt(nPlazas));
            if(oSeguridad != 0) query.setString(oSeguridad, seguridad);
            
            rsCeldas = query.executeQuery();
            
            while(rsCeldas.next()){
                auxCell = new Celda(rsCeldas.getInt("numCelda"),
                                    rsCeldas.getFloat("superficie"),
                                    rsCeldas.getInt("numCamas"),
                                    Nivel.valueOf(rsCeldas.getString("seguridad")),
                                    rsCeldas.getInt("ocupantes")
                );
                celdas.add(auxCell);
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
        }
        return celdas;
    }
    
    public void eliminarCelda(Celda celda){
        Connection con;
        
        PreparedStatement query = null;
        
        String consulta = "DELETE FROM celda WHERE numCelda = ?";
        
        con = this.getConnection();
        try{
            query = con.prepareStatement(consulta);
            
            query.setInt(1, celda.getnCelda());
            
            query.execute();
        } catch(SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();   
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
        }
    }
    
    //Si llegamos aqui quiere decir que la celda no es vacia y hay campos que cambiar
    public void modificarCelda(Celda celda, String nPlazas, String superficie, String seguridad){
        Connection con;
        
        PreparedStatement query = null;
        
        String consulta = "UPDATE celda SET numCamas = ?, superficie = ?, seguridad = ? WHERE numCelda = ?";
        
        con = this.getConnection();
        
        try{
            query = con.prepareStatement(consulta);
            
            query.setInt(1, Integer.parseInt(nPlazas)); //SET numCamas
            query.setFloat(2, Float.parseFloat(superficie));    //SET superficie
            query.setString(3, seguridad);  //SET seguridad
            query.setInt(4, celda.getnCelda()); //WHERE numCelda
            
            query.execute();    //Ejecucion
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();   
            } catch (SQLException e) {
                System.out.println("Imposible cerrar Cursores");
            }
        }
    }
    
}
