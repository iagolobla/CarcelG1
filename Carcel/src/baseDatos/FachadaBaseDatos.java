package baseDatos;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class FachadaBaseDatos {
    
    private carcel.FachadaCarcel fa;
    private Connection conexion;
    private DAOEmpleados daoEmpleados;

    public FachadaBaseDatos(carcel.FachadaCarcel fa) {
        Properties configuracion = new Properties();
        this.fa = fa;
        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion = java.sql.DriverManager.getConnection("jdbc:" + gestor + "://"
                    + configuracion.getProperty("servidor") + ":"
                    + configuracion.getProperty("puerto") + "/"
                    + configuracion.getProperty("baseDatos"),
                    usuario);
            
        daoEmpleados = new DAOEmpleados(conexion, fa);

        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            //Aqui se mostraria la ventana de error
            //fa.mostrarExcepcion(String string);
        } catch (IOException | SQLException i) {
            System.out.println(i.getMessage());
            //Aqui se mostraria la ventana de error
        }
    }
    
    public carcel.Empleado validarAdmin(String dni, String clave){
        return daoEmpleados.validarAdmin(dni, clave);
    }
    
}
