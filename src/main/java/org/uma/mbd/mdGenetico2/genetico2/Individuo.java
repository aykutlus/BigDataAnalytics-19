package org.uma.mbd.mdGenetico2.genetico2;

import org.uma.mbd.mdGenetico2.genetico2.Problema;

public class Individuo {
    private Cromosoma cromosoma;
    private double fitness;
    public Individuo(int longitud, Problema problema){
        cromosoma = new Cromosoma(longitud, true);
        fitness = problema.evalua(cromosoma);
    }

    public Individuo(Cromosoma cromosoma, Problema problema){
        this.cromosoma = cromosoma.copia();
        fitness = problema.evalua(this.cromosoma);
    }

    public Cromosoma getCromosoma() {
        return cromosoma.copia();
    }

    public double getFitness() {
        return fitness;
    }

    @Override
    public String toString() {
        return "Individuo(" + cromosoma + ", " + fitness + ")";
    }
}
