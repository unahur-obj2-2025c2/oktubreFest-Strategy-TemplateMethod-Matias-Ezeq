package ar.edu.unahur.obj2.cerveza;

import ar.edu.unahur.obj2.marcas.Marca;

public class Negra extends Marca{
    private static Double graduacionMinima;

    public Negra(Double contenidoDeLupulo, String paisDeOrigen) {
        super(contenidoDeLupulo, paisDeOrigen);
    }


    @Override
    public Double graduacionAlcoholica() {
        return graduacionMinima + super.getContenidoDeLupulo()*2;
    }

    public static Double getGraduacionMinima() {
        return graduacionMinima;
    }


    public static void setGraduacionMinima(Double graduacionMinima) {
        Negra.graduacionMinima = graduacionMinima;
    }

}
