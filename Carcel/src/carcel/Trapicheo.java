package carcel;

import java.sql.Date;

public class Trapicheo {

    private Preso preso1;
    private Preso preso2;
    private Objeto objeto;
    private java.sql.Date fecha;

    public Trapicheo(Preso preso1, Preso preso2, Objeto objeto, Date fecha) {
        this.preso1 = preso1;
        this.preso2 = preso2;
        this.objeto = objeto;
        this.fecha = fecha;
    }

    public Preso getPreso1() {
        return preso1;
    }

    public void setPreso1(Preso preso1) {
        this.preso1 = preso1;
    }

    public Preso getPreso2() {
        return preso2;
    }

    public void setPreso2(Preso preso2) {
        this.preso2 = preso2;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
