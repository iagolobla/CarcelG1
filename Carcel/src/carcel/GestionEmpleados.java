package carcel;

import gui.FachadaGUI;
import baseDatos.FachadaBaseDatos;
import java.util.ArrayList;

public class GestionEmpleados {
    protected FachadaGUI fgui;
    protected FachadaBaseDatos fbd;

    protected GestionEmpleados(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    protected Boolean validarAdmin(String dni, String clave){
        Empleado empleado = fbd.validarAdmin(dni, clave);
        
        if (empleado instanceof carcel.Administrador && empleado!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Guardia> buscarGuardias(String DNI, String Nombre, String Agresividad){
        return fbd.buscarGuardias(DNI,Nombre,Agresividad);
    }
    
    public void asociarGuardia(Celda celda, Guardia guardia){
        fbd.asociarGuardia(celda, guardia);
    }
    
    public void desasociarGuardia(Celda celda){
        fbd.desasociarGuardia(celda);
    }
    
}
