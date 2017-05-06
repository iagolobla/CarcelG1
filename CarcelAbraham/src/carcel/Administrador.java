package carcel;

public class Administrador extends Empleado {

    private String contraseña;

    public Administrador(String DNI, String nombre, String apellido1, String apellido2, String contraseña) {
        super(DNI, nombre, apellido1, apellido2);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
