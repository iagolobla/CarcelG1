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
    private FachadaGUI fgui;
    private FachadaBaseDatos fbd;
    
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
    
    public void eliminarCelda(Celda celda){
        fbd.eliminarCelda(celda);
    }
    
    public void modificarCelda(Celda celda, String nPlazas, String superficie, String seguridad){
        //Si todos los campos ya son iguales, no vamos a pasar la consulta a la fachada base de datos
        if(String.valueOf(celda.getnCamas()).equals(nPlazas) && 
           String.valueOf(celda.getSuperficie()).equals(superficie) &&
           celda.getSeguridad().toString().equals(seguridad)){
            return;
        }
        fbd.modificarCelda(celda, nPlazas, superficie, seguridad);
    }
}
