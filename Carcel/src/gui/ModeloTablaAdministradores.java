package gui;

import carcel.Administrador;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaAdministradores extends AbstractTableModel {

    private java.util.List<Administrador> administradores;

    public ModeloTablaAdministradores() {
        this.administradores = new ArrayList<Administrador>();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return administradores.size();
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
                nombre = "Contraseña";
                break;
            case 3:
                nombre = "Puesto";
                break;
            case 4:
                nombre = "Telefono";
                break;
            case 5:
                nombre = "Direccion";
                break;
            case 6:
                nombre = "Email";
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
                clase = java.lang.Integer.class;
                break;
            case 5:
                clase = java.lang.String.class;
                break;
            case 6:
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
                resultado = administradores.get(row).getDNI();
                break;
            case 1:
                resultado = administradores.get(row).getNombre();
                break;
            case 2:
                resultado = administradores.get(row).getContrasena();
                break;
            case 3:
                resultado = administradores.get(row).getPuesto();
                break;
            case 4:
                resultado = administradores.get(row).getTelefono();
                break;
            case 5:
                resultado = administradores.get(row).getDireccion();
                break;
            case 6:
                resultado = administradores.get(row).getEmail();
                break;
        }
        return resultado;
    }

    @Override
    public void setValueAt(Object v, int row, int col) {
        switch (col) {
            case 0:
                administradores.get(row).setDNI((String) v);
                break;
            case 1:
                administradores.get(row).setNombre((String) v);
                break;
            case 2:
                administradores.get(row).setContrasena((String) v);
                break;
            case 3:
                administradores.get(row).setPuesto((String) v);
                break;
            case 4:
                administradores.get(row).setTelefono((int) v);
                break;
            case 5:
                administradores.get(row).setDireccion((String) v);
                break;
            case 6:
                administradores.get(row).setEmail((String) v);
                break;
        }
    }

    public void setFilas(java.util.List<Administrador> administradores) {
        this.administradores = administradores;
        fireTableDataChanged();
    }

    public void nuevoAdministrador(Administrador e) {
        this.administradores.add(e);
        fireTableRowsInserted(this.administradores.size() - 1, this.administradores.size() - 1);
    }

    public void borrarAdministrador(int indice) {
        this.administradores.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    public java.util.List<Administrador> getFilas() {
        return this.administradores;
    }

    public Administrador obtenerAdministrador(int i) {
        return this.administradores.get(i);
    }
}
