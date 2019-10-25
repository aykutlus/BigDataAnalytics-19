package org.uma.mbd.mdGenetico2.genetico2;

import org.uma.mbd.mdGenetico2.genetico2.Problema;

public class CeroMax implements Problema {
    @Override
    public double evalua(Cromosoma crom) {
        double fit = 0;
        for(int i = 0; i < crom.getLongitud(); i++){
            if(crom.getGen(i) == 0){
                fit++;
            }
        }

        return fit;
    }

}
