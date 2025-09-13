package ar.edu.unahur.obj2.cerveza;

import ar.edu.unahur.obj2.marcas.Marca;

public class Roja extends Marca{
    private static Double graduacionMinima;

    public Roja(Double contenidoDeLupulo, String paisDeOrigen) {
        super(contenidoDeLupulo, paisDeOrigen);
    }

    @Override
    public Double graduacionAlcoholica() {
        return (graduacionMinima + super.getContenidoDeLupulo() * 2) * 1.25;
    }

}
