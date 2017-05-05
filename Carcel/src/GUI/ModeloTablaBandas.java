package GUI;

import carcel.Banda;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaBandas extends AbstractTableModel {

    private java.util.List<Banda> bandas;

    public ModeloTablaBandas() {
        this.bandas = new ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return bandas.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Tipo_Banda";
                break;
            case 1:
                nombre = "Numero_Miembros";
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
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col > 0;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = bandas.get(row).getTipo_banda();
                break;
            case 1:
                resultado = bandas.get(row).getPresos();
                break;
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 1:
                bandas.get(row).setTipo_banda((String) v);
                break;
            case 2:
                bandas.get(row).setPresos((int) v);
                break;
        }
    }

    public void setFilas(java.util.List<Banda> bandas) {
        this.bandas = bandas;
        fireTableDataChanged();
    }

    public void nuevaBanda(Banda e) {
        this.bandas.add(e);
        fireTableRowsInserted(this.bandas.size() - 1, this.bandas.size() - 1);
    }

    public void borrarBanda(int indice) {
        this.bandas.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public java.util.List<Banda> getFilas() {
        return this.bandas;
    }

    public Banda obtenerBanda(int i) {
        return this.bandas.get(i);
    }
}
