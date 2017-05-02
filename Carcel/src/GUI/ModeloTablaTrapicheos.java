package GUI;

import carcel.Objeto;
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
        return 4;
    }

    public int getRowCount() {
        return trapicheos.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Preso1";
                break;
            case 1:
                nombre = "Preso2";
                break;
            case 2:
                nombre = "Objeto";
                break;
            case 3:
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
                clase = java.lang.Integer.class;
                break;
            case 2:
                clase = java.lang.Integer.class;
                break;
            case 3:
                clase = java.util.Date.class;
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
                resultado = trapicheos.get(row).getPreso1();
                break;
            case 1:
                resultado = trapicheos.get(row).getPreso2();
                break;
            case 2:
                resultado = trapicheos.get(row).getObjeto();
                break;
            case 3:
                resultado = trapicheos.get(row).getFecha();
                break;
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 1:
                trapicheos.get(row).setPreso1((Preso) v);
                break;
            case 2:
                trapicheos.get(row).setPreso2((Preso) v);
                break;
            case 3:
                trapicheos.get(row).setObjeto((Objeto) v);
                break;
            case 4:
                trapicheos.get(row).setFecha((java.sql.Date) (Date) v);
                break;
        }
    }

    public void setFilas(java.util.List<Trapicheo> trapicheos) {
        this.trapicheos = trapicheos;
        fireTableDataChanged();
    }

    public Trapicheo obtenerTrapicheo(int i) {
        return this.trapicheos.get(i);
    }

}
