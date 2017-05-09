package carcel;

import gui.FachadaGUI;
import baseDatos.FachadaBaseDatos;

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
    
}
