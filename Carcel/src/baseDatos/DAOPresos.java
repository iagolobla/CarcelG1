package baseDatos;

import carcel.Preso;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOPresos extends AbstractDAO{
    
    public DAOPresos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    protected Boolean comprobarReincidente(String DNI){
        return null;
    }
    
    protected void insertarPreso(Preso preso){
        Connection con;
        PreparedStatement stmPreso = null;
        con = super.getConnection();
    }
    
    protected void liberarPreso(String DNI){
        Connection con;
        PreparedStatement stmPreso = null;
    }
}
