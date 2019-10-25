package org.uma.mbd.mdGenetico2.genetico2;

import org.uma.mbd.mdGenetico2.genetico2.Problema;

public abstract class AlgoritmoGenetico {
    private Poblacion poblacion;
    private Problema problema;
    private int pasos;
    private double probMutacion;
    public AlgoritmoGenetico(int tPoblacion, int longCromosoma, int pasos, double probMutacion, Problema problema){
        this.pasos = pasos;
        this.probMutacion = probMutacion;
        this.problema = problema;
        poblacion = new Poblacion(tPoblacion, longCromosoma, this.problema);
    }

    public Individuo ejecuta(){
        Cromosoma crom;

        for (int i = 0; i < pasos; i++) {
            int indexA = Cromosoma.gna.nextInt(poblacion.getNumIndividuos());
            int indexB;
            do {
                indexB = Cromosoma.gna.nextInt(poblacion.getNumIndividuos());
            } while(indexA == indexB);
            crom = recombinar(poblacion.getIndividuos(indexA).getCromosoma(),
                    poblacion.getIndividuos(indexB).getCromosoma());
            crom.mutar(probMutacion);
            poblacion.reemplaza(new Individuo(crom, problema));
        }

        return poblacion.mejorIndividuo();
    }

    protected abstract Cromosoma recombinar(Cromosoma cromA, Cromosoma cromB);
}
