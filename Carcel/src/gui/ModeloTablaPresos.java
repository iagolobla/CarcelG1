package gui;

import carcel.Banda;
import carcel.Nivel;
import carcel.Preso;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaPresos extends AbstractTableModel {

    private java.util.List<Preso> presos;

    public ModeloTablaPresos() {
        this.presos = new ArrayList<Preso>();
    }

    public int getColumnCount() {
        return 8;
    }

    public int getRowCount() {
        return presos.size();
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
                nombre = "Apodo";
                break;
            case 3:
                nombre = "Fecha_Nacimiento";
                break;
            case 4:
                nombre = "Fecha_Ingreso";
                break;
            case 5:
                nombre = "Fecha_Salida";
                break;
            case 6:
                nombre = "Banda";
                break;
            case 7:
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
                clase = java.sql.Date.class;
                break;
            case 4:
                clase = java.sql.Date.class;
                break;
            case 5:
                clase = java.sql.Date.class;
                break;
            case 6:
                clase = java.lang.String.class;
                break;
            case 7:
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
                resultado = presos.get(row).getDNI();
                break;
            case 1:
                resultado = presos.get(row).getNombre();
                break;
            case 2:
                resultado = presos.get(row).getApodo();
                break;
            case 3:
                resultado = presos.get(row).getFechaNacimiento();
                break;
            case 4:
                resultado = presos.get(row).getFechaIngreso();
                break;
            case 5:
                resultado = presos.get(row).getFechaSalida();
                break;
            case 6:
                resultado = presos.get(row).getBanda().getTipo_banda();
                break;
            case 7:
                resultado = presos.get(row).getAgresividad().toString();
                break;
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 0:
                presos.get(row).setDNI((String) v);
                break;
            case 1:
                presos.get(row).setNombre((String) v);
                break;
            case 2:
                presos.get(row).setApodo((String) v);
                break;
            case 3:
                presos.get(row).setFechaNacimiento(Date.valueOf((String)v));
                break;
            case 4:
                presos.get(row).setFechaIngreso(Date.valueOf((String)v));
                break;
            case 5:
                presos.get(row).setFechaSalida(Date.valueOf((String)v));
                break;
            case 6:
                presos.get(row).setBanda((Banda) v);
                break;
            case 7:
                presos.get(row).setAgresividad(Nivel.valueOf((String) v));
                break;
        }
    }

    public void setFilas(java.util.List<Preso> presos) {
        this.presos = presos;
        fireTableDataChanged();
    }

    public void nuevoPreso(Preso e) {
        this.presos.add(e);
        fireTableRowsInserted(this.presos.size() - 1, this.presos.size() - 1);
    }

    public void borrarPreso(int indice) {
        this.presos.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public java.util.List<Preso> getFilas() {
        return this.presos;
    }

    public Preso obtenerPreso(int i) {
        return this.presos.get(i);
    }
}
