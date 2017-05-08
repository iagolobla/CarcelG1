package carcel;

public class Banda {

    private String tipo_banda;
    private int presos;

    public Banda(String tipo_banda, int presos) {
        this.tipo_banda = tipo_banda;
        this.presos = presos;
    }

    public Banda(String tipo_banda) {
        this.tipo_banda = tipo_banda;
    }

    public String getTipo_banda() {
        return tipo_banda;
    }

    public void setTipo_banda(String tipo_banda) {
        this.tipo_banda = tipo_banda;
    }

    public int getPresos() {
        return presos;
    }

    public void setPresos(int presos) {
        this.presos = presos;
    }

}
