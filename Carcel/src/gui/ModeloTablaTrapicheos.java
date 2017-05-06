package gui;

import carcel.Preso;
import carcel.Trapicheo;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaTrapicheos extends AbstractTableModel {

    private java.util.List<Trapicheo> trapicheos;

    public ModeloTablaTrapicheos() {
        this.trapicheos = new ArrayList<Trapicheo>();
    }

    public int getColumnCount() {
        return 8;
    }

    public int getRowCount() {
        return trapicheos.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "DNI Preso1";
                break;
            case 1:
                nombre = "Nombre Preso1";
                break;
            case 2:
                nombre = "Apodo Preso1";
                break;
            case 3:
                nombre = "DNI Preso2";
                break;
            case 4:
                nombre = "Nombre Preso2";
                break;
            case 5:
                nombre = "Apodo Preso2";
                break;
            case 6:
                nombre = "Objeto";
                break;
            case 7:
                nombre = "Fecha";
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
                clase = java.lang.String.class;
                break;
            case 6:
                clase = java.lang.String.class;
                break;
            case 7:
                clase = java.sql.Date.class;
                break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 6 || col == 7;
    }

    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = trapicheos.get(row).getPreso1().getDNI();
                break;
            case 1:
                resultado = trapicheos.get(row).getPreso1().getNombre();
                break;
            case 2:
                resultado = trapicheos.get(row).getPreso1().getApodo();
                break;
            case 3:
                resultado = trapicheos.get(row).getPreso2().getDNI();
                break;
            case 4:
                resultado = trapicheos.get(row).getPreso2().getNombre();
                break;
            case 5:
                resultado = trapicheos.get(row).getPreso2().getApodo();
                break;
            case 6:
                resultado = trapicheos.get(row).getObjeto();
                break;
            case 7:
                resultado = trapicheos.get(row).getFecha();
                break;
        }
        return resultado;
    }

    /*
    No se como hacer bien el setValueAt, tengo el mismo problema en el modelo de las Visitas
    */
    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 6:
                trapicheos.get(row).setObjeto((String) v);
                break;
            case 7:
                trapicheos.get(row).setFecha(java.sql.Date.valueOf((String) v));
                break;
        }
    }

    public void setFilas(java.util.List<Trapicheo> trapicheos) {
        this.trapicheos = trapicheos;
        fireTableDataChanged();
    }
    
    public void nuevoTrapicheo(Trapicheo e) {
        this.trapicheos.add(e);
        fireTableRowsInserted(this.trapicheos.size() - 1, this.trapicheos.size() - 1);
    }

    public void borrarTrapicheo(int indice) {
        this.trapicheos.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public Trapicheo obtenerTrapicheo(int i) {
        return this.trapicheos.get(i);
    }

}
