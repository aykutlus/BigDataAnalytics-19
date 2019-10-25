package org.uma.mbd.mdGenetico.genetico;

public class OneMax implements Problema {

    @Override
    public double evalua(Cromosoma dato) {
        double salida= 0;
        for(int i=0;i<(dato.getLongitud());i++){
            salida = salida+dato.getGen(i);
        }

        return salida;
    }

}
