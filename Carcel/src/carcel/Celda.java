package carcel;

public class Celda {

    private int nCelda;
    private float superficie;
    private int nCamas;
    private Nivel seguridad;
    private Preso[] ocupantes;  //Reservar memoria para el array de tamaño NCamas

    public Celda(int nCelda, float superficie, int nCamas, Nivel seguridad) {
        this.nCelda = nCelda;
        this.superficie = superficie;
        this.nCamas = nCamas;
        this.seguridad = seguridad;
        ocupantes = new Preso[nCamas];
    }

    public Celda(int nCelda, float superficie, int nCamas, Nivel seguridad, Preso[] ocupantes) {
        this.nCelda = nCelda;
        this.superficie = superficie;
        this.nCamas = nCamas;
        this.seguridad = seguridad;
        this.ocupantes = ocupantes;
    }

    public int getnCelda() {
        return nCelda;
    }

    public void setnCelda(int nCelda) {
        this.nCelda = nCelda;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getnCamas() {
        return nCamas;
    }

    public void setnCamas(int nCamas) {
        this.nCamas = nCamas;
    }

    public Nivel getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(Nivel seguridad) {
        this.seguridad = seguridad;
    }

    public Preso[] getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(Preso[] ocupantes) {
        this.ocupantes = ocupantes;
    }

}
