package carcel;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGUI;
import java.util.List;

public class GestionPresos {
    protected FachadaGUI fgui;
    protected FachadaBaseDatos fbd;

    public GestionPresos(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    protected void insertarPreso(Preso preso){
       String DNI = preso.getDNI();
       if (fbd.comprobarReincidente(DNI)){
           fbd.insertarPresoReincidente(preso);
       }
       else{
           fbd.insertarPresoNoReincidente(preso);
       }
    }

    protected void liberarPreso(String DNI) {
        fbd.liberarPreso(DNI);
    }
    
    protected java.util.List<Preso> buscarPreso(String DNI, String nombre, String apodo){
        return fbd.buscarPreso(DNI, nombre, apodo);
    }
    
    public java.util.List<String> rellenarCampos(String tipo){
        return(fbd.rellenarCampos(tipo));
    }
    
    public java.util.List<Delito> obtenerCargos(String tipo) {
        return fbd.consultarCargos(tipo);
    }
    
    protected java.util.List<Delito> obtenerCargosPreso(String DNI){
        return fbd.consultarCargosPreso(DNI);
    }
    
}