package baseDatos;

import carcel.Banda;
import carcel.Celda;
import carcel.Empleado;
import carcel.Preso;
import carcel.Delito;
import carcel.Guardia;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FachadaBaseDatos {
    
    private carcel.FachadaCarcel fa;
    private Connection conexion;
    private DAOEmpleados daoEmpleados;
    private DAOPresos daoPresos;
    private DAOCeldas daoCeldas;
    private DAODelitos daoDelitos;

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
        daoPresos = new DAOPresos(conexion, fa);
        daoCeldas = new DAOCeldas(conexion, fa);
        daoDelitos = new DAODelitos(conexion, fa);

        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            //Aqui se mostraria la ventana de error
            //fa.mostrarExcepcion(String string);
        } catch (IOException | SQLException i) {
            System.out.println(i.getMessage());
            //Aqui se mostraria la ventana de error
        }
    }
    
    public Empleado validarAdmin(String dni, String clave){
        return daoEmpleados.validarAdmin(dni, clave);
    }
    
    public Boolean comprobarReincidente(String DNI){
        return daoPresos.comprobarReincidente(DNI);
    }
    
    public void insertarPresoNoReincidente(Preso preso){
        daoPresos.insertarPresoNoReincidente(preso);
    }
    
    public void insertarPresoReincidente(Preso preso){
        daoPresos.insertarPresoReincidente(preso);
    }

    public void liberarPreso(String DNI) {
        daoPresos.liberarPreso(DNI);
    }
    
    public java.util.List<Preso> buscarPreso(String DNI, String nombre, String apodo){
        return daoPresos.buscarPresos(DNI, nombre, apodo);
    }
    
    public void insertarCelda(String nPlazas, String superficie, String seguridad){
        daoCeldas.insertarCelda(nPlazas, superficie, seguridad);
    }
    
    public java.util.List<String> rellenarCampos(String tipo){
        return daoPresos.rellenarCampos(tipo);
    }

    public List<Delito> consultarCargosPreso(String DNI) {
        return daoPresos.consultarCargosPreso(DNI);
    }
    
    public Celda obtenerCelda(String id){
        return daoCeldas.obtenerCelda(id);
    }
    
    public ArrayList<Celda> buscarCelda(String id, String nPlazas, String seguridad){
        return daoCeldas.buscarCelda(id, nPlazas, seguridad);
    }
    
    public void asociarPreso(String DNI, Banda banda){
        daoPresos.asociarPreso(DNI, banda);
    }
    
    public void desasociarPreso(String dni){
        daoPresos.desasociarPreso(dni);
    }
    
    public void eliminarCelda(Celda celda){
        daoEmpleados.desasociarGuardia(celda);
        daoCeldas.eliminarCelda(celda);
    }
    
    public void modificarCelda(Celda celda, String nPlazas, String superficie, String seguridad){
        daoCeldas.modificarCelda(celda, nPlazas, superficie, seguridad);
    }
    
    public ArrayList<Preso> buscarPresosCelda(Celda celda){
        return daoPresos.buscarPresosCelda(celda);
    }
    
    public java.util.List<Banda> obtenerBandas(String tipo) {
        return daoPresos.obtenerBanda(tipo);
    }
    
    public void insertarCargo(String dni, Delito delito){
        if(!daoDelitos.comprobarDelito(delito)){
            daoDelitos.insertarDelito(delito);
        }
        if(!daoDelitos.comprobarCargo(dni, delito)){
            daoDelitos.insertarCargo(dni, delito);
        } else{
            System.out.println("El preso ya tiene un cargo de ese tipo!");
        }
    }
    
    public void eliminarCargos(Preso preso){
        daoDelitos.eliminarCargos(preso);
    }
    
    public void intercambiarPresos(Preso preso1, Preso preso2){
        daoPresos.intercambiarPresos(preso1, preso2);
    }
    
    public ArrayList<Guardia> buscarGuardias(String DNI, String Nombre, String Agresividad){
        return daoEmpleados.buscarGuardias(DNI,Nombre,Agresividad);
    }
    
    public void asociarGuardia(Celda celda, Guardia guardia){
        daoEmpleados.asociarGuardia(celda, guardia);
    }
    public void desasociarGuardia(Celda celda){
        daoEmpleados.desasociarGuardia(celda);
    }
}
