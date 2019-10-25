package org.uma.mbd.mdGenetico.genetico;

import java.util.Random;

public class Cromosoma {

    private int longitud;
    protected int[] datos;
    protected static Random gna = new Random();
    protected static final int GEN_POR_DEFECTO=0;

    public Cromosoma(int n, boolean aleatoria) {
        this.datos = new int[n];
        if (aleatoria){
            Random aleario = new Random();
            for (int i = 0; i < datos.length; i++) {
                datos[i] = aleario.nextInt(2); // 0 veya 1 sayısını random olarak üretiyor
            }
        } else {
            for (int i = 0; i < datos.length; i++) {
                datos[i] = GEN_POR_DEFECTO;
            }
        }
    }

    public int getGen(int pos){
        if ((pos > datos.length ) || (pos < 0)){
            throw new IndexOutOfBoundsException("Error de gen"); // gen 0 veya 1 olmak zorunda
        } else{
            return datos[pos];
        }

    }
    public void setGen(int gen,int pos) {
        if (gen > 1 || gen < 0) {
            throw new RuntimeException("Error gen number is wrong");
        } else {
            if (pos < 0 || pos > datos.length) {
                throw new RuntimeException("Incorrect position");
            } else {
                datos[pos] = gen;
            }
        }
    }

    public int getLongitud(){
        return datos.length;
    }

    public Cromosoma copia() {
        if (this.datos == null) {
            throw new RuntimeException(
                    "Error!No se puede crear algo que no esta creado ");
        } else {
            Cromosoma salida = new Cromosoma(this.getLongitud(), true);
            salida.datos = this.datos.clone();
            return salida;
        }
    }

    public void mutar(double probabilidad) {
        Random ran = new Random();
        for (int i = 0; i < this.getLongitud(); i++) {
            if (probabilidad < ran.nextDouble()) {
                if (this.datos[i] == 1) {
                    this.setGen(1,i);
                } else {
                    this.setGen(0, i);
                }
            }
        }

    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < datos.length - 1; i++) {
            s.append(datos[i]).append(", ");
        }
        return "[" + s + datos[datos.length - 1] + "]";
    }
}


    









