package org.uma.mbd.mdGenetico2.genetico2;

public class OneMax implements Problema {
    @Override
    public double evalua(Cromosoma crom) {
        double fit = 0;
        for(int i = 0; i < crom.getLongitud(); i++){
            if(crom.getGen(i) == 1){
                fit++;
            }
        }

        return fit;
    }
}
