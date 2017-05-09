package gui;

import carcel.Delito;
import carcel.Nivel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaCargos extends AbstractTableModel {

    private java.util.List<Delito> delitos;

    public ModeloTablaCargos() {
        this.delitos = new ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return delitos.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Tipo_Delito";
                break;
            case 1:
                nombre = "Descripcion";
                break;
            case 2:
                nombre = "Intensidad";
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
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col >= 0;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = delitos.get(row).getTipo_delito();
                break;
            case 1:
                resultado = delitos.get(row).getDescripcion();
                break;
            case 2:
                resultado = delitos.get(row).getIntensidad().toString();
                break;
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 0:
                delitos.get(row).setTipo_delito((String) v);
                break;
            case 1:
                delitos.get(row).setDescripcion((String) v);
                break;
            case 2:
                delitos.get(row).setIntensidad(Nivel.valueOf((String) v));
                break;
        }
    }

    public void setFilas(java.util.List<Delito> delitos) {
        this.delitos = delitos;
        fireTableDataChanged();
    }

    public void nuevoCargo(Delito e) {
        this.delitos.add(e);
        fireTableRowsInserted(this.delitos.size() - 1, this.delitos.size() - 1);
    }

    public void borrarCargo(int indice) {
        this.delitos.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public java.util.List<Delito> getFilas() {
        return this.delitos;
    }

    public Delito obtenerCargo(int i) {
        return this.delitos.get(i);
    }
}
