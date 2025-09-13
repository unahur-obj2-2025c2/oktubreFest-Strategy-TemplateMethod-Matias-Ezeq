package ar.edu.unahur.obj2.personas;

import java.util.List;

import ar.edu.unahur.obj2.cerveza.Jarra;

public class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean leGustaLaMusicaTradicional;
    private Integer nivelDeAguante;
    //private Nacionalidad nacionalidad;

    public Boolean estaEbria() {
        return this.alcoholIngerido() * peso > nivelDeAguante;
    }

    public Double alcoholIngerido() {
        return jarrasCompradas.stream().mapToDouble(j -> j.cantidadDeAlcohol()).sum();
    }
}
