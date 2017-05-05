package carcel;

import GUI.FachadaGUI;
import baseDatos.FachadaBaseDatos;

public class GestionPresos {
    protected FachadaGUI fgui;
    protected FachadaBaseDatos fbd;

    public GestionPresos(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    protected void insertarPreso(Preso p){
        fbd.insertarPreso(p);
    }

    protected void iniciaGestionPresos() {
        fgui.iniciaGestionPresos();
    }
}
