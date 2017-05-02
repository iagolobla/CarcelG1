package carcel;

public class FachadaCarcel {
    
    private GUI.FachadaGUI fgui;
    private baseDatos.FachadaBaseDatos fbd;
    private GestionEmpleados ge;

    public FachadaCarcel() {
        fgui = new GUI.FachadaGUI(this);
        fbd = new baseDatos.FachadaBaseDatos(this);
        ge = new GestionEmpleados(fgui, fbd);
    }
    
    public static void main(String[] args) {
        FachadaCarcel fa;
        
        fa = new FachadaCarcel();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        fgui.iniciaVista();
    }

    public Boolean validarAdministrador(String dni, String clave) {
        return ge.validarAdmin(dni, clave);
    }
}
