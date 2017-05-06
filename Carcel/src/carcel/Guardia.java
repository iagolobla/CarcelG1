package carcel;

public class Guardia extends Empleado {

    private Nivel agresividad;

    public Guardia(String DNI, String nombre, String puesto, int telefono, String direccion, String email, Nivel agresividad) {
        super(DNI, nombre, puesto, telefono, direccion, email);
        this.agresividad = agresividad;
    }

    public Nivel getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(Nivel agresividad) {
        this.agresividad = agresividad;
    }

}
