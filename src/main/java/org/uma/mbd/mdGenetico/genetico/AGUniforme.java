package org.uma.mbd.mdGenetico.genetico;


import java.util.Random;

public class AGUniforme extends AlgoritmoGenetico{
    public AGUniforme(int tamPoblacion, int longuiIndividuo, int pasos, double probabilidad, Problema problem) {
        super(tamPoblacion, longuiIndividuo, pasos, probabilidad, problem);
    }

    protected Cromosoma Recombinar(Cromosoma primero, Cromosoma segundo) {
        Cromosoma salida = new Cromosoma(primero.getLongitud(), false);
        Random ran = new Random();
        for(int i = 0 ;i<primero.getLongitud();i++){

            if(ran.nextInt()%1 == 0){
                salida.setGen(primero.getGen(i), i);
            }else{
                salida.setGen(segundo.getGen(i), i);
            }
        }
        return salida;

    }
}
