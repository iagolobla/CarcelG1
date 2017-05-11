package gui;

import carcel.Celda;
import carcel.Nivel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaCeldas extends AbstractTableModel {

    private java.util.List<Celda> celdas;

    public ModeloTablaCeldas() {
        this.celdas = new ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public int getRowCount() {
        return celdas.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Num_Celda";
                break;
            case 1:
                nombre = "Num_Plazas";
                break;
            case 2:
                nombre = "Superficie";
                break;
            case 3:
                nombre = "Seguridad";
                break;
            case 4:
                nombre = "Num_Ocupantes";
                break;
            case 5:
                nombre = "Plazas_Libres";
                break;
                
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.Integer.class;
                break;
            case 1:
                clase = java.lang.Integer.class;
                break;
            case 2:
                clase = java.lang.Integer.class;
                break;
            case 3:
                clase = java.lang.String.class;
                break;
            case 4:
                clase = java.lang.Integer.class;
                break;
            case 5:
                clase = java.lang.Integer.class;
                break;
                
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col != 0 && col != 4 && col != 5;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = celdas.get(row).getnCelda();
                break;
            case 1:
                resultado = celdas.get(row).getnCamas();
                break;
            case 2:
                resultado = celdas.get(row).getSuperficie();
                break;
            case 3:
                resultado = celdas.get(row).getSeguridad().toString();
                break;
            case 4:
                resultado = celdas.get(row).getnOcupantes();
                break;    
            case 5:
                resultado = celdas.get(row).getnCamas() - celdas.get(row).getnOcupantes();
                break;
                
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 1:
                celdas.get(row).setnCamas((int) v);
                break;
            case 2:
                celdas.get(row).setSuperficie((int) v);
                break;
            case 3:
                celdas.get(row).setSeguridad((Nivel.valueOf((String) v)));
                break;
        }
    }

    public void setFilas(java.util.List<Celda> celdas) {
        this.celdas = celdas;
        fireTableDataChanged();
    }

    public void nuevaCelda(Celda e) {
        this.celdas.add(e);
        fireTableRowsInserted(this.celdas.size() - 1, this.celdas.size() - 1);
    }

    public void borrarCelda(int indice) {
        this.celdas.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public java.util.List<Celda> getFilas() {
        return this.celdas;
    }

    public Celda obtenerCelda(int i) {
        return this.celdas.get(i);
    }

}
