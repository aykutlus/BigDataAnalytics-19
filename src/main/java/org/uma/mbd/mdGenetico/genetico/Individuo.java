package org.uma.mbd.mdGenetico.genetico;

public class Individuo {

    private double fitness;
    private Cromosoma crom;

    Individuo (int cant,Problema problema){

        this.crom = new Cromosoma(cant, true);
        this.fitness = problema.evalua(crom);
    }

    Individuo(Cromosoma cromo, Problema problema) {

        this.crom = cromo.copia();
        this.fitness = problema.evalua(crom);
    }

    public Cromosoma cromosoma() {
        return this.crom;
    }

    public double fitness() {
        return this.fitness;
    }


    @Override
    public String toString() {
        return "Individuo(" + crom + ", " + fitness + ")";
    }
}




