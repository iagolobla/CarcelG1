package carcel;

import java.util.ArrayList;

public class FachadaCarcel {

    private gui.FachadaGUI fgui;
    private baseDatos.FachadaBaseDatos fbd;
    private GestionCeldas gc;
    private GestionEmpleados ge;
    private GestionTrapicheos gt;
    private GestionPresos gp;

    public FachadaCarcel() {
        fgui = new gui.FachadaGUI(this);
        fbd = new baseDatos.FachadaBaseDatos(this);
        ge = new GestionEmpleados(fgui, fbd);
        gp = new GestionPresos(fgui, fbd);
        gt = new GestionTrapicheos(fgui, fbd);
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

    public Boolean validarAdministrador(String dni, String clave) {
        return ge.validarAdmin(dni, clave);
    }

    public void iniciaGestionTrapicheos() {
        fgui.iniciaVTrapicheos();
    }

    public void iniciaGestionEmpleados() {
        fgui.iniciaVGestionEmpleados();
    }

    public void iniciaGestionPresos() {
        fgui.iniciaVGestionPresos();
    }

    public void iniciaGestionCeldas() {
        fgui.iniciaVGestionCeldas();
    }

    public void iniciaGestionBandas() {
        fgui.iniciaVGestionBandas();
    }

    public void iniciaGestionVisitas() {
        fgui.iniciaVGestionVisitas();
    }

    public void iniciaPreso() {
        fgui.iniciaVPreso();
    }

    public void iniciaPreso(Preso preso) {
        fgui.iniciaVPreso(preso);
    }

    public void insertarPreso(Preso preso) {
        gp.insertarPreso(preso);
    }

    public void liberarPreso(String DNI) {
        gp.liberarPreso(DNI);
    }
    
    public java.util.List<Preso> buscarPreso(String DNI, String nombre, String apodo){
        return gp.buscarPreso(DNI, nombre, apodo);
    }

    public void iniciaRelacionesBanda() {
        fgui.iniciaVGestionBandasRelaciones();
    }

    public void iniciaVisita() {
        fgui.iniciaVModVisita();
    }
    
    public java.util.List<Delito> obtenerCargosPreso(String DNI) {
        return gp.obtenerCargosPreso(DNI);
    }
    
    public java.util.List<String> rellenarCampos(String tipo){
        return gp.rellenarCampos(tipo);
    }

    public void insertarCelda(String nPlazas, String superficie, String seguridad){
        gc.insertarCelda(nPlazas, superficie, seguridad);
    }
    
    public void muestraExcepcion(String mensaje){
        fgui.muestraExcepcion(mensaje);
    }
    
    public Celda obtenerCelda(String id){
        return gc.obtenerCelda(id);
    }
    
    public ArrayList<Celda> buscarCelda(String id, String nPlazas, String seguridad){
        return gc.buscarCelda(id, nPlazas, seguridad);
    }
    
    public void asociarPreso(String DNI, Banda banda){
        gp.asociarPreso(DNI, banda);
    }
    
    public void eliminarCelda(Celda celda){
        gc.eliminarCelda(celda);
    }
    
    public void modificarCelda(Celda celda, String nPlazas, String superficie, String seguridad){
        gc.modificarCelda(celda, nPlazas, superficie, seguridad);
    }
    
    public void insertarCargo(String dni, Delito delito){
        gp.insertarCargo(dni, delito);
    }
}
