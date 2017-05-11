package carcel;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Preso {

    private String DNI;
    private String nombre;
    private String apodo;
    private java.sql.Date fechaNacimiento;
    private java.sql.Date fechaIngreso;
    private java.sql.Date fechaSalida;
    private Banda banda;
    private Nivel agresividad;
    private Celda celda;
    private HashMap<String, Delito> cargos; //<tipo_delito, Delito>

    public Preso(){
        this.DNI = "";
        this.nombre = "";
        this.apodo = "";
        this.fechaNacimiento = null;
        this.fechaIngreso = null;
        this.fechaSalida = null;
        this.banda = null;
        this.agresividad = null;
        this.celda = null;
        this.cargos = new HashMap<>();
    }
    
    public Preso(Preso otroPreso) {
        this.DNI = otroPreso.getDNI();
        this.nombre = otroPreso.getNombre();
        this.apodo = otroPreso.getApodo();
        this.fechaNacimiento = otroPreso.getFechaNacimiento();
        this.fechaIngreso = otroPreso.getFechaIngreso();
        this.fechaSalida = otroPreso.getFechaSalida();
        this.banda = otroPreso.getBanda();
        this.agresividad = otroPreso.getAgresividad();
        this.celda = otroPreso.getCelda();
        this.cargos = otroPreso.getCargos();
    }
    
    public Preso(String DNI, String nombre, String apodo, Date fechaNacimiento, Date fechaIngreso, 
            Date fechaSalida, Banda banda, Nivel agresividad, Celda celda) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apodo = apodo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.banda = banda;
        this.agresividad = agresividad;
        this.celda = celda;
        this.cargos = new HashMap<>();
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
        if(banda==null){
            this.banda=null;
        } else{
            this.banda = new Banda(banda);
        }
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
        this.celda = new Celda(celda);
    }

    public HashMap<String, Delito> getCargos() {
        return cargos;
    }

    public void setCargos(ArrayList<Delito> cargos) {
        for(Delito delito : cargos){
            this.cargos.put(delito.getTipo_delito(), delito);
        }
    }
}
