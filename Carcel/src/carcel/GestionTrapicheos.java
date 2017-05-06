/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carcel;

import gui.FachadaGUI;
import baseDatos.FachadaBaseDatos;
import java.sql.Date;

/**
 *
 * @author carlos
 */
public class GestionTrapicheos {
    protected FachadaGUI fgui;
    protected FachadaBaseDatos fbd;
    
    public GestionTrapicheos(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    public java.util.List<Trapicheo> obtenerTrapicheos(String dniEmisor, String nombreEmisor, String apodoEmisor, String dniReceptor, String nombreReceptor, String apodoReceptor, Date fecha){
        return null;
    }
    
}
