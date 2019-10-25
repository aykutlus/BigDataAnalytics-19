package org.uma.mbd.mdAltura.altura;

public class MenoresQue implements Seleccion {

    private double alturaMaxima;

    public MenoresQue(double am){
        alturaMaxima =am;
    }

    @Override
    public boolean test(Pais pais){
        return pais.getAltura() < alturaMaxima;
    }
}
