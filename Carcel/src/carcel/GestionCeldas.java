package carcel;

import GUI.FachadaGUI;
import baseDatos.FachadaBaseDatos;

public class GestionCeldas {

    protected FachadaGUI fgui;
    protected FachadaBaseDatos fbd;

    public GestionCeldas(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    public void iniciaGestionCeldas() {
        fgui.iniciaGestionCeldas();
    }

}
