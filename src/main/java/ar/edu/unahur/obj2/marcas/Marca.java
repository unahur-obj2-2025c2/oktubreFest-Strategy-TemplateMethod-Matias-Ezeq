package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    private final Double contenidoDeLupulo;
    private final String paisDeOrigen;
 
    public Marca(Double contenidoDeLupulo, String paisDeOrigen) {
        this.contenidoDeLupulo = contenidoDeLupulo;
        this.paisDeOrigen = paisDeOrigen;
    }

    public Double getContenidoDeLupulo() {
        return contenidoDeLupulo;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public abstract Double graduacionAlcoholica();

}
