package ar.edu.unahur.obj2.cerveza;

import ar.edu.unahur.obj2.marcas.Marca;

public class Rubia extends Marca{
    private final Double graduacionAlcoholica;

    public Rubia(Double contenidoDeLupulo, String paisDeOrigen, Double graduacionAlcoholica) {
        super(contenidoDeLupulo, paisDeOrigen);
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    @Override
    public Double graduacionAlcoholica() {
        return graduacionAlcoholica;
    }

}
