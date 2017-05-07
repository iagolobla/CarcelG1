package baseDatos;

import carcel.Preso;
import java.sql.Connection;

public class DAOPresos extends AbstractDAO{
    
    public DAOPresos(Connection connection, carcel.FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    protected Boolean comprobarReincidente(String DNI){
        return null;
    }
    
    protected void insertarPreso(Preso preso){
        
    }
}
