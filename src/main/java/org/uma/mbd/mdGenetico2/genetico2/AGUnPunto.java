package org.uma.mbd.mdGenetico2.genetico2;

public class AGUnPunto extends AlgoritmoGenetico {

    public AGUnPunto(int tPoblacion, int longCromosoma, int pasos, double probMutacion, Problema problema) {
        super(tPoblacion, longCromosoma, pasos, probMutacion, problema);
    }

    @Override
    protected Cromosoma recombinar(Cromosoma cromA, Cromosoma cromB){
        int z = cromA.gna.nextInt(cromA.getLongitud());

        Cromosoma cromR = cromA.copia();
        for(int i = z+1; i < cromA.getLongitud(); i++){
            cromR.setGen(i, cromB.getGen(i));
        }
        return cromR.copia();
    }
}
