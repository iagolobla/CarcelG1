package carcel;

public abstract class Empleado {

    private String DNI;
    private String nombre;
    private Nivel2 puesto;
    private String telefono;
    private String direccion;
    private String email;

    public Empleado(String DNI, String nombre, Nivel2 puesto, String telefono, String direccion, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.puesto = puesto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel2 getPuesto() {
        return puesto;
    }
    
    public void setPuesto(Nivel2 puesto) {
        this.puesto = puesto;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
