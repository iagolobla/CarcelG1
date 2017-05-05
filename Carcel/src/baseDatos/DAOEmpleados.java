package baseDatos;

import carcel.Administrador;
import carcel.FachadaCarcel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOEmpleados extends AbstractDAO{

    public DAOEmpleados(Connection connection, FachadaCarcel fa) {
        super.setConnection(connection);
        super.setFachadaCarcel(fa);
    }
    
    protected carcel.Empleado validarAdmin(String dni, String clave){
        Administrador resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsAdministrador;

        con = super.getConnection();

        try {
            stmUsuario = con.prepareStatement("SELECT DNI, nombre, puesto, telefono, email, contraseña "
                    + "FROM administradores "
                    + "WHERE DNI = ? AND contraseña = ?");
            stmUsuario.setString(1, dni);
            stmUsuario.setString(2, clave);
            rsAdministrador = stmUsuario.executeQuery();
            if (rsAdministrador.next()) {
                resultado = new carcel.Administrador(rsAdministrador.getString("DNI"), rsAdministrador.getString("nombre"), "", "", rsAdministrador.getString("contraseña"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
}
