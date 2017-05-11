package baseDatos;

import carcel.Celda;
import carcel.Guardia;
import carcel.Nivel;
import carcel.Nivel2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOEmpleados extends AbstractDAO{

    public DAOEmpleados(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    public carcel.Empleado validarAdmin(String dni, String clave){
        carcel.Administrador resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsAdministrador;

        con = super.getConnection();

        try {
            stmUsuario = con.prepareStatement("SELECT DNI, nombre, puesto, telefono, direccion, email, contraseña "
                    + "FROM administrador "
                    + "WHERE DNI = ? AND contraseña = ?");
            stmUsuario.setString(1, dni);
            stmUsuario.setString(2, clave);
            rsAdministrador = stmUsuario.executeQuery();
            if (rsAdministrador.next()) {
                resultado = new carcel.Administrador(rsAdministrador.getString("DNI"), rsAdministrador.getString("nombre"), rsAdministrador.getString("contraseña"), Nivel2.valueOf(rsAdministrador.getString("puesto")), rsAdministrador.getString("telefono"), rsAdministrador.getString("direccion"), rsAdministrador.getString("email"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public ArrayList<Guardia> buscarGuardias(String DNI, String Nombre, String Agresividad){
        Connection con = this.getConnection();
        ArrayList<Guardia> resultado = new ArrayList<>();
        
        PreparedStatement query = null;
        ResultSet rsGuardias;
        
        String consulta = "SELECT * FROM guardia WHERE DNI like ? "
                                                + "AND nombre like ? "
                                                + "AND agresividad like ?";
        
        try{
            query = con.prepareStatement(consulta);
            
            query.setString(1, "%"+DNI+"%");
            query.setString(2, "%"+Nombre+"%");
            query.setString(3, "%"+Agresividad+"%");
            
            rsGuardias = query.executeQuery();
            
            while (rsGuardias.next()){
                Guardia aux = new Guardia(  rsGuardias.getString("DNI"),
                                            rsGuardias.getString("nombre"),
                                            Nivel2.valueOf(rsGuardias.getString("puesto")),
                                            rsGuardias.getString("telefono"),
                                            rsGuardias.getString("direccion"),
                                            rsGuardias.getString("email"),
                                            Nivel.valueOf(rsGuardias.getString("agresividad"))
                );
                
                resultado.add(aux);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public void asociarGuardia(Celda celda, Guardia guardia){
        Connection con = this.getConnection();
        
        PreparedStatement query = null;
        
        String consulta = "INSERT INTO vigilar VALUES (?, ?)";
        try{
            query = con.prepareStatement(consulta);
            query.setInt(1, celda.getnCelda());
            query.setString(2, guardia.getDNI());
            
            query.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public void desasociarGuardia(Celda celda){
        Connection con = this.getConnection();
       
        PreparedStatement query = null;
        
        String consulta = "DELETE FROM vigilar WHERE celda = ?";
        try{
            query = con.prepareStatement(consulta);
            query.setInt(1, celda.getnCelda());
            
            query.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaCarcel().muestraExcepcion(e.getMessage());
        } finally {
            try {
                query.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
}
