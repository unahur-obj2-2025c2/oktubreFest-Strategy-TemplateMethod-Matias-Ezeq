package ar.edu.unahur.obj2.personas.nacionalidad;

import ar.edu.unahur.obj2.cerveza.Jarra;

public class Aleman implements Nacionalidad {

    @Override
    public Boolean leGustaLaCerveza(Jarra cerveza) {
        return Boolean.TRUE;
    }

}
