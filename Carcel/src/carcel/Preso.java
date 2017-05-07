package carcel;

import java.sql.Date;

public class Preso {

    private String DNI;
    private String nombre;
    private String apodo;
    private java.sql.Date fechaNacimiento;
    private java.sql.Date fechaIngreso;
    private java.sql.Date fechaSalida;
    private Banda banda;
    private String categoria;
    private Nivel agresividad;
    private Celda celda;

    public Preso(String DNI, String nombre, String apodo, Date fechaNacimiento, Date fechaIngreso, 
            Date fechaSalida, Banda banda, String categoria, Nivel agresividad, Celda celda) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apodo = apodo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.banda = banda;
        this.categoria = categoria;
        this.agresividad = agresividad;
        this.celda = celda;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Nivel getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(Nivel agresividad) {
        this.agresividad = agresividad;
    }

    public Celda getCelda() {
        return celda;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }
}
