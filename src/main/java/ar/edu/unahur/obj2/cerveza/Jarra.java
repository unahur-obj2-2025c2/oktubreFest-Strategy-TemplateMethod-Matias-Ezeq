package ar.edu.unahur.obj2.cerveza;

import ar.edu.unahur.obj2.marcas.Marca;

public class Jarra {
    private final Double litros;
    private final Marca marca;

    public Jarra(Double litros, Marca marca) {
        this.litros = litros;
        this.marca = marca;
    }

    public Double getLitros() {
        return litros;
    }

    public Marca getMarca() {
        return marca;
    }

    public Double cantidadDeAlcohol() {
        return litros * marca.graduacionAlcoholica();
    }
    
}
