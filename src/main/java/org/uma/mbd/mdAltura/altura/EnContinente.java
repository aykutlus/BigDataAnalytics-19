package org.uma.mbd.mdAltura.altura;

public class EnContinente implements Seleccion {

    private String continente ;

    public EnContinente(String c){
        continente=c;
    }

    @Override
    public boolean test(Pais pais) {
        return pais.getContiene().contains(continente);
    }
}
