package org.uma.mbd.mdGenetico.genetico;

import java.util.Random;

public abstract class AlgoritmoGenetico {

    private int pasos;
    private double probMutacion;
    private Poblacion pobla;
    private Problema problem;

    public AlgoritmoGenetico (int tamPoblacion, int longuiIndividuo, int pasos, double probabilidad, Problema problem) {
        this.problem = problem;
        this.pobla = new Poblacion(tamPoblacion, longuiIndividuo, problem);
        this.probMutacion = probabilidad;
        this.pasos = pasos;
    }

    public Individuo ejecuta() {
        int aletorio1, aleatorio2;
        Random ran = new Random();
        Cromosoma racromo = new Cromosoma(this.pobla.mejorIndividuo().cromosoma().getLongitud(), false);
        Individuo nuevo;

        for (int i = 0; i < this.pasos; i++) {
            aletorio1 = ran.nextInt(this.pobla.numIndividuos());
            aleatorio2 = ran.nextInt(this.pobla.numIndividuos());
            racromo = Recombinar(pobla.individuo(aletorio1).cromosoma(), pobla.individuo(aleatorio2).cromosoma());
            racromo.mutar(probMutacion);
            nuevo = new Individuo(racromo, problem);
            this.pobla.reemplaza(nuevo);
        }

        return this.pobla.mejorIndividuo();
    }

    protected abstract Cromosoma Recombinar(Cromosoma primero, Cromosoma segundo);

}
