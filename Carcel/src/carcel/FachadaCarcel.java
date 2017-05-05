package carcel;

import GUI.FachadaGUI;
import baseDatos.FachadaBaseDatos;

public class FachadaCarcel {

    private GUI.FachadaGUI fgui;
    private baseDatos.FachadaBaseDatos fbd;
    private GestionEmpleados ge;
    private GestionPresos gp;
    private GestionCeldas gc;

    public FachadaCarcel() {
        fgui = new FachadaGUI(this);
        fbd = new FachadaBaseDatos(this);
        ge = new GestionEmpleados(fgui, fbd);
        gp = new GestionPresos(fgui, fbd);
        gc = new GestionCeldas(fgui, fbd);
    }

    public static void main(String[] args) {
        FachadaCarcel fa;
        fa = new FachadaCarcel();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        fgui.iniciaVista();
    }

    /*-----------------Presos--------------------------------*/
    public void iniciaGestionPresos() {
        gp.iniciaGestionPresos();
    }

    public void nuevoPreso() {
        gp.nuevoPreso();
    }

    public void modificarPreso(Preso preso) {
        gp.modificarPreso(preso);
    }

    /*-----------------Empleados-----------------------------*/
    public Boolean validarAdministrador(String dni, String clave) {
        return ge.validarAdmin(dni, clave);
    }

    /*-----------------Celdas-------------------------------*/
    public void iniciaGestionCeldas() {
        gc.iniciaGestionCeldas();
    }
}
