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
}
