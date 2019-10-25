package org.uma.mbd.mdAltura.altura;

public class MayoresQue implements Seleccion {

    private double alturaMinima;

    public MayoresQue(double am){
        alturaMinima =am;
    }
    @Override
    public boolean test(Pais pais){
        return pais.getAltura() >= alturaMinima;
    }
}
