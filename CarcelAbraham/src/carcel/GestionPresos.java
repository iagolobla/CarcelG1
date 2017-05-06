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

    protected void iniciaGestionPresos() {
        fgui.iniciaGestionPresos();
    }

    protected void nuevoPreso() {
        fgui.nuevoPreso();
    }

    protected void modificarPreso(Preso preso) {
        fgui.modificarPreso(preso);
    }
}
