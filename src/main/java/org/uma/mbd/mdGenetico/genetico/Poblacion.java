package org.uma.mbd.mdGenetico.genetico;

public class Poblacion {

    private Individuo [] individuos;
    private int numindividuos;

    public Poblacion(int largo, int largoCromo, Problema problema) {

        individuos = new Individuo[largo];
        for (int i = 0; i < largo; i++) {
            individuos[i] = new Individuo(largoCromo, problema);

        }
    }
    public int numIndividuos() {

        if (individuos == null) {
            return 0;
        } else {
            return individuos.length;
        }
    }
    public Individuo individuo(int i) {
        if (this.individuos == null) {
            throw new RuntimeException("No has inicializado la estructura");
        } else {
            if ((i < 0) || (i > (individuos.length - 1))) {
                throw new RuntimeException(
                        "Posicion no adecuada dentro de la poblacion");
            } else {
                return individuos[i];
            }
        }
    }
    public Individuo mejorIndividuo() {

        Individuo salida = null;

        if (individuos == null) {
            throw new RuntimeException("No has inicializado la estructura");
        } else {
            salida = individuos[0];

            for (int i = 1; i < individuos.length; i++) {

                if (salida.fitness() <= individuos[i].fitness()) {
                    salida = individuos[i];
                }
            }
        }
        return salida;
    }

    public void reemplaza(Individuo nuevo) {
        Individuo peor = individuos[0];
        int pos = 0;
        for (int i = 1; i < individuos.length; i++) {

            if (peor.fitness() > individuos[i].fitness()) {
                pos = i;

            }
        }
        if (individuos[pos].fitness() < nuevo.fitness()) {
            individuos[pos] = nuevo;
        }

    }

}
