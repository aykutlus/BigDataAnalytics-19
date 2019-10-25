package org.uma.mbd.mdGenetico2.genetico2;

import org.uma.mbd.mdGenetico2.genetico2.Problema;

public class AGUniforme extends AlgoritmoGenetico {
    public AGUniforme(int tPoblacion, int longCromosoma, int pasos, double probMutacion, Problema problema) {
        super(tPoblacion, longCromosoma, pasos, probMutacion, problema);
    }

    @Override
    protected Cromosoma recombinar(Cromosoma cromA, Cromosoma cromB){
        Cromosoma cromR = new Cromosoma(cromA.getLongitud(), false);

        for(int i = 0; i < cromA.getLongitud(); i++){
            int index = Cromosoma.gna.nextInt(cromR.getLongitud());
            if(Cromosoma.gna.nextBoolean()) {
                cromR.setGen(i, cromA.getGen(index));
            } else {
                cromR.setGen(i, cromB.getGen(index));
            }
        }
        return cromR.copia();
    }
}
