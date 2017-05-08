package carcel;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGUI;
import java.util.ArrayList;

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
    
    protected java.util.List<Delito> obtenerCargosPreso(String DNI){
        return fbd.consultarCargosPreso(DNI);
    }
    
    public void asociarPreso(String DNI, Banda banda){
        fbd.asociarPreso(DNI, banda);
    }
    
    public void desasociarPreso(String dni){
        fbd.desasociarPreso(dni);
    }
    
    public ArrayList<Preso> buscarPresosCelda(Celda celda){
        return fbd.buscarPresosCelda(celda);
    }
    
    protected java.util.List<Banda> obtenerBandas(String tipo) {
        return fbd.obtenerBandas(tipo);
    }
    
    public void insertarCargo(String dni, Delito delito){
        fbd.insertarCargo(dni, delito);
    }
    
    public void modificarCargo(String dni, Delito delito){
        fbd.modificarCargo(dni, delito);
    }
    
    public void eliminarCargo(String dni, Delito delito){
        fbd.eliminarCargo(dni, delito);
    }
    
    public void intercambiarPresos(Preso preso1, Preso preso2){
        fbd.intercambiarPresos(preso1, preso2);
    }
    
}
