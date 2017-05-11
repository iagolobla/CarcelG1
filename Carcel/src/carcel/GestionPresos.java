package carcel;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGUI;
import java.util.ArrayList;

public class GestionPresos {

    private FachadaGUI fgui;
    private FachadaBaseDatos fbd;

    public GestionPresos(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    public void insertarPreso(Preso preso) {
        String DNI = preso.getDNI();
        if (fbd.comprobarReincidente(DNI)) {
            fbd.insertarPresoReincidente(preso);
        } else {
            fbd.insertarPresoNoReincidente(preso);
        }
    }

    public void liberarPreso(String DNI) {
        fbd.liberarPreso(DNI);
    }

    public java.util.List<Preso> buscarPreso(String DNI, String nombre, String apodo) {
        return fbd.buscarPreso(DNI, nombre, apodo);
    }

    public java.util.List<String> rellenarCampos(String tipo) {
        return (fbd.rellenarCampos(tipo));
    }

    public java.util.List<Delito> obtenerCargosPreso(String DNI) {
        return fbd.consultarCargosPreso(DNI);
    }

    public void asociarPreso(String DNI, Banda banda) {
        fbd.asociarPreso(DNI, banda);
    }

    public void desasociarPreso(String dni) {
        fbd.desasociarPreso(dni);
    }

    public ArrayList<Preso> buscarPresosCelda(Celda celda) {
        return fbd.buscarPresosCelda(celda);
    }

    public java.util.List<Banda> obtenerBandas(String tipo) {
        return fbd.obtenerBandas(tipo);
    }

    public void insertarCargos(Preso preso) {
        if (preso != null && !preso.getDNI().isEmpty()) {
            for (Delito delito : preso.getCargos().values()) {
                fbd.insertarCargo(preso.getDNI(), delito);
            }
        }
    }

    public void eliminarCargos(Preso preso) {
        if (preso != null && !preso.getDNI().isEmpty()) {
            fbd.eliminarCargos(preso);
        }
    }

    public void intercambiarPresos(Preso preso1, Preso preso2) {
        fbd.intercambiarPresos(preso1, preso2);
    }

}
