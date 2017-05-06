/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import carcel.Visita;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class ModeloTablaVisitas extends AbstractTableModel{
    private java.util.List<Visita> visitas;

    public ModeloTablaVisitas() {
        this.visitas = new ArrayList<Visita>();
    }

    public int getColumnCount() {
        return 7;
    }

    public int getRowCount() {
        return visitas.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "DNI Preso";
                break;
            case 1:
                nombre = "Nombre Preso";
                break;
            case 2:
                nombre = "Apodo";
                break;
            case 3:
                nombre = "DNI Visitante";
                break;
            case 4:
                nombre = "Nombre Visitante";
                break;
            case 5:
                nombre = "Fecha Visita";
                break;
            case 6:
                nombre = "Relacion";
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
            case 5:
                clase = java.sql.Date.class;
                break;
            case 6:
                clase = java.lang.String.class;
                break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col > 0;
    }

    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = visitas.get(row).getPreso().getDNI();
                break;
            case 1:
                resultado = visitas.get(row).getPreso().getNombre();
                break;
            case 2:
                resultado = visitas.get(row).getPreso().getApodo();
                break;
            case 3:
                resultado = visitas.get(row).getVisitante().getDNI();
                break;
            case 4:
                resultado = visitas.get(row).getVisitante().getNombre();
                break;
            case 5:
                resultado = visitas.get(row).getFecha();
                break;
            case 6:
                resultado = visitas.get(row).getRelacion();
                break;
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 0:
                visitas.get(row).getPreso().setDNI((String) v);
                break;
            case 1:
                visitas.get(row).getPreso().setNombre((String) v);
                break;
            case 2:
                visitas.get(row).getPreso().setApodo((String) v);
                break;
            case 3:
                visitas.get(row).getVisitante().setDNI((String)v);
                break;
            case 4:
                visitas.get(row).getVisitante().setNombre((String)v);
                break;
            case 5:
                visitas.get(row).setFecha(Date.valueOf((String)v));
                break;
            case 6:
                visitas.get(row).setRelacion((String) v);
                break;
        }
    }

    public void setFilas(java.util.List<Visita> visitas) {
        this.visitas = visitas;
        fireTableDataChanged();
    }

    public void nuevaVisita(Visita e) {
        this.visitas.add(e);
        fireTableRowsInserted(this.visitas.size() - 1, this.visitas.size() - 1);
    }

    public void borrarVisita(int indice) {
        this.visitas.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public java.util.List<Visita> getFilas() {
        return this.visitas;
    }

    public Visita obtenerVisita(int i) {
        return this.visitas.get(i);
    }
}
