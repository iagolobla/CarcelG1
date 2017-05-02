package carcel;

import java.sql.Date;

public class Preso {

    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String apodo;
    private java.sql.Date fechaNacimiento;
    private java.sql.Date fechaIngreso;
    private java.sql.Date fechaSalida;
    private Banda banda;
    private Nivel agresividad;

    public Preso(String DNI, String nombre, String apellido1, String apellido2, String apodo, Date fechaNacimiento, Date fechaIngreso, Date fechaSalida, Banda banda, Nivel agresividad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.apodo = apodo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.banda = banda;
        this.agresividad = agresividad;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Nivel getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(Nivel agresividad) {
        this.agresividad = agresividad;
    }

}
