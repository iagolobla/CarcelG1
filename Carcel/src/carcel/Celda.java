package carcel;

public class Celda {

    private int nCelda;
    private float superficie;
    private int nCamas;
    private Nivel seguridad;
    private Preso[] ocupantes;  //Reservar memoria para el array de tamaño NCamas
    private int nOcupantes;
    private Guardia guardia;

    public Celda(Celda celda){
        this.nCamas = celda.getnCamas();
        this.nCelda = celda.getnCelda();
        this.nOcupantes = celda.getnOcupantes();
        this.ocupantes = celda.getOcupantes();
        this.seguridad = celda.getSeguridad();
        this.superficie = celda.getSuperficie();
        this.guardia = celda.getGuardia();
    }
    
    
    public Celda(int nCelda, float superficie, int nCamas, Nivel seguridad) {
        this.nCelda = nCelda;
        this.superficie = superficie;
        this.nCamas = nCamas;
        this.seguridad = seguridad;
        this.ocupantes = new Preso[nCamas];
        this.nOcupantes = 0;
    }
    
    public Celda(int nCelda, float superficie, int nCamas, Nivel seguridad, int nOcupantes, Guardia guardia) {
        this.nCelda = nCelda;
        this.superficie = superficie;
        this.nCamas = nCamas;
        this.seguridad = seguridad;
        this.ocupantes = new Preso[nCamas];
        this.nOcupantes = nOcupantes;
        this.guardia = guardia;
    }

    public Celda(int nCelda, float superficie, int nCamas, Nivel seguridad, Preso[] ocupantes) {
        this.nCelda = nCelda;
        this.superficie = superficie;
        this.nCamas = nCamas;
        this.seguridad = seguridad;
        this.ocupantes = ocupantes;
        this.nOcupantes = this.ocupantes.length;
    }

    public Celda(int nCelda) {
        this.nCelda = nCelda;
        superficie = 0.0f;
        nCamas = 0;
        seguridad = null;
        ocupantes = null;
        nOcupantes = 0;
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

    public int getnOcupantes() {
        return nOcupantes;
    }

    public void setnOcupantes(int nOcupantes) {
        this.nOcupantes = nOcupantes;
    }
    
    public Guardia getGuardia(){
        return(this.guardia);
    }
    
    public void setGuardia(Guardia guardia){
        this.guardia = guardia;
    }

}
