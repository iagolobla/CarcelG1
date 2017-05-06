package carcel;

import java.sql.Date;

public class Visita {

    private Visitante visitante;
    private Preso preso;
    private java.sql.Date fecha;
    private String relacion;

    public Visita(Visitante visitante, Preso preso, Date fecha, String relacion) {
        this.visitante = visitante;
        this.preso = preso;
        this.fecha = fecha;
        this.relacion = relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Preso getPreso() {
        return preso;
    }

    public void setPreso(Preso preso) {
        this.preso = preso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
