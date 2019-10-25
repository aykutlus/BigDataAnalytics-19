package org.uma.mbd.mdGenetico.genetico;

import java.util.Random;

public class AGUnPunto extends AlgoritmoGenetico {

    public AGUnPunto(int tamPoblacion, int longuiIndividuo, int pasos, double probabilidad, Problema problem) {
        super(tamPoblacion, longuiIndividuo, pasos, probabilidad, problem);

    }

    protected Cromosoma Recombinar(Cromosoma primero, Cromosoma segundo) {
        Random dictador = new Random();
        Cromosoma salida = new Cromosoma(primero.getLongitud(), false);
        int vcb = dictador.nextInt(primero.getLongitud());
        for (int i = 0; i < vcb; i++) {

            salida.setGen(primero.getGen(i), i);
        }
        for (int i = vcb; i < primero.getLongitud(); i++) {
            salida.setGen(segundo.getGen(i), i);
        }
        return salida;
    }

}