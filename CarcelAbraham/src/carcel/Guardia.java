package carcel;

public class Guardia extends Empleado {

    private Nivel agresividad;

    public Guardia(String DNI, String nombre, String apellido1, String apellido2, Nivel agresividad) {
        super(DNI, nombre, apellido1, apellido2);
        this.agresividad = agresividad;
    }

    public Nivel getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(Nivel agresividad) {
        this.agresividad = agresividad;
    }

}
