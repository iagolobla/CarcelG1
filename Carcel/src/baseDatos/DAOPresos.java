package baseDatos;

import carcel.Preso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPresos extends AbstractDAO{
    
    public DAOPresos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    protected Boolean comprobarReincidente(String DNI){
        Boolean resultado = false;
        Connection con;
        PreparedStatement stmPreso = null;
        ResultSet rsPreso;

        con = super.getConnection();

        try {
            stmPreso = con.prepareStatement("SELECT dni "
                    + "FROM preso "
                    + "WHERE DNI = ? ");
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
    
    protected void insertarPresoNoReincidente(Preso preso){
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();
        
        
    }
    
    protected void insertarPresoReincidente(Preso preso){
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();
    }
    
    protected void liberarPreso(String DNI){
        Connection con;
        PreparedStatement stmPreso = null;
    }
}
