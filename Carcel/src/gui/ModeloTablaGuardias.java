/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import carcel.Guardia;
import carcel.Nivel;
import carcel.Nivel2;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class ModeloTablaGuardias extends AbstractTableModel{
    
    private java.util.List<Guardia> guardias;
    
    public ModeloTablaGuardias() {
        this.guardias = new java.util.ArrayList<Guardia>();
    }

    public int getColumnCount() {
        return 5;
    }

    public int getRowCount() {
        return guardias.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "DNI";
                break;
            case 1:
                nombre = "Nombre";
                break;
            case 2:
                nombre = "Puesto";
                break;
            case 3:
                nombre = "Email";
                break;
            case 4:
                nombre = "Agresividad";
                break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.String.class;
                break;
            case 1:
                clase = java.lang.String.class;
                break;
            case 2:
                clase = java.lang.String.class;
                break;
            case 3:
                clase = java.lang.String.class;
                break;
            case 4:
                clase = java.lang.String.class;
                break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = guardias.get(row).getDNI();
                break;
            case 1:
                resultado = guardias.get(row).getNombre();
                break;
            case 2:
                resultado = guardias.get(row).getPuesto().toString();
                break;
            case 3:
                resultado = guardias.get(row).getEmail();
                break;
            case 4:
                resultado = guardias.get(row).getAgresividad().toString();
                break;
        }
        return resultado;
    }
    
    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 0:
                guardias.get(row).setDNI((String) v);
                break;
            case 1:
                guardias.get(row).setNombre((String) v);
                break;
            case 2:
                guardias.get(row).setPuesto(Nivel2.valueOf((String) v));
                break;
            case 3:
                guardias.get(row).setEmail((String) v);
                break;
            case 4:
                guardias.get(row).setAgresividad(Nivel.valueOf((String) v));
                break;
        }
    }

    public void setFilas(java.util.List<Guardia> guardias) {
        this.guardias = guardias;
        fireTableDataChanged();
    }

    public Guardia obtenerGuardia(int i) {
        return this.guardias.get(i);
    }
    
    public java.util.List<Guardia> getFilas() {
        return this.guardias;
    }
    
    public void nuevoGuardia(Guardia g){
        this.guardias.add(g);
        fireTableRowsInserted(this.guardias.size()-1, this.guardias.size()-1);
    }
    
    public void actualizarGuardia(int indice, Guardia g){
        this.guardias.set(indice, g);
        fireTableRowsUpdated(indice, indice);
    }
    
    public void eliminarGuardia(int indice){
        this.guardias.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
