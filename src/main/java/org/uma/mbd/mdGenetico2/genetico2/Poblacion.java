package org.uma.mbd.mdGenetico2.genetico2;

import org.uma.mbd.mdGenetico2.genetico2.Problema;

public class Poblacion {
    private Individuo[] individuos;
    private int numIndividuos;

    public Poblacion(int largo, int largoCromo, Problema problema){
        if((largo < 0) || (largoCromo < 0)){
            throw new IllegalArgumentException("Population or length is not valid!");
        }
        individuos = new Individuo[largo];
        for (int i = 0; i < largo; i++) {
            individuos[i] = new Individuo(largoCromo, problema);
        }
    }

    public Individuo getIndividuos(int j) {
        if(j >= individuos.length){
            throw new IndexOutOfBoundsException("Position is not valid");
        }
        return individuos[j];
    }

    public int getNumIndividuos() {
        return individuos.length;
    }

    public Individuo mejorIndividuo(){
        int j = 0;
        double fit = 0;
        for(int k = 0; k < numIndividuos; k++){
            if(individuos[k].getFitness() > fit){
                fit = individuos[k].getFitness();
                j = k;
            }
        }
        return individuos[j];
    }

    private int peorIndividuo(){
        int j = 0;
        double fit = 10000;
        for(int k = 0; k < numIndividuos; k++){
            if(individuos[k].getFitness() < fit){
                fit = individuos[k].getFitness();
                j = k;
            }
        }
        return j;
    }

    public void reemplaza(Individuo ind){
        int j = this.peorIndividuo();
        if(this.individuos[j].getFitness() < ind.getFitness()){
            this.individuos[j] = ind;
        }
    }
}
