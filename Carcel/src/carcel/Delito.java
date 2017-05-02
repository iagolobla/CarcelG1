package carcel;

public class Delito {

    private String tipo_delito;
    private String descripcion;
    private Nivel intensidad;

    public Delito(String tipo_delito, String descripcion, Nivel intensidad) {
        this.tipo_delito = tipo_delito;
        this.descripcion = descripcion;
        this.intensidad = intensidad;
    }

    public String getTipo_delito() {
        return tipo_delito;
    }

    public void setTipo_delito(String tipo_delito) {
        this.tipo_delito = tipo_delito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Nivel getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Nivel intensidad) {
        this.intensidad = intensidad;
    }

}
