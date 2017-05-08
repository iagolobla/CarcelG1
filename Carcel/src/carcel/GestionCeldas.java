/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carcel;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGUI;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestionCeldas {
    protected FachadaGUI fgui;
    protected FachadaBaseDatos fbd;
    
    public GestionCeldas(FachadaGUI fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    public void insertarCelda(String nPlazas, String superficie, String seguridad){        
        fbd.insertarCelda(nPlazas, superficie, seguridad);
    }
    
    public Celda obtenerCelda(String id){
        if(id.isEmpty())    return null;

        return fbd.obtenerCelda(id);
    }
    
    public ArrayList<Celda> buscarCelda(String id, String nPlazas, String seguridad){
        return fbd.buscarCelda(id,nPlazas,seguridad);
    }
}
