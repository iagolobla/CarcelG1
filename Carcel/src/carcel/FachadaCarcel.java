package carcel;

public class FachadaCarcel {
    
    private gui.FachadaGUI fgui;
    private baseDatos.FachadaBaseDatos fbd;
    private GestionEmpleados ge;
    private GestionTrapicheos gt;

    public FachadaCarcel() {
        fgui = new gui.FachadaGUI(this);
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
    
    public void iniciaGestionTrapicheos(){
        fgui.iniciaVTrapicheos();
    }
    
    public void iniciaGestionEmpleados(){
        fgui.iniciaVGestionEmpleados();
    }
    
    public void iniciaGestionPresos(){
        fgui.iniciaVGestionPresos();
    }
    
    public void iniciaGestionCeldas(){
        fgui.iniciaVGestionCeldas();
    }
    
    public void iniciaGestionBandas(){
        fgui.iniciaVGestionBandas();
    }
    
    public void iniciaGestionVisitas(){
        fgui.iniciaVGestionVisitas();
    }
    
    public void iniciaPreso(){
        fgui.iniciaVPreso();
    }
    
    public void iniciaRelacionesBanda(){
        fgui.iniciaVGestionBandasRelaciones();
    }
    
    public void iniciaVisita(){
        fgui.iniciaVModVisita();
    }
    
}
