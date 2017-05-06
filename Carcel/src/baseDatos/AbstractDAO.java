package baseDatos;

import java.sql.Connection;

public abstract class AbstractDAO {
    private carcel.FachadaCarcel fa;
    private Connection connection;

    public carcel.FachadaCarcel getFachadaCarcel() {
        return fa;
    }

    public void setFachadaCarcel(carcel.FachadaCarcel fa) {
        this.fa = fa;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
