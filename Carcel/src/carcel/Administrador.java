package carcel;

public class Administrador extends Empleado {

    private String contrasena;

    public Administrador(String DNI, String nombre, String contrasena, String puesto, int telefono, String direccion, String email) {
        super(DNI, nombre, puesto, telefono, direccion, email);
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
