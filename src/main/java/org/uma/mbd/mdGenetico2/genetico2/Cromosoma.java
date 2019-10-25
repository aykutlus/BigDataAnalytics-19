package org.uma.mbd.mdGenetico2.genetico2;

import java.util.Random;

public class Cromosoma {
    private int longitud;
    protected int[] datos;
    protected static Random gna = new Random(100);
    protected static int GEN_POR_DEFECTO = 0;

    public Cromosoma(int longitud, boolean ini){
        if(longitud <= 0){
            throw new IllegalArgumentException("Length is not valid");
        }
        this.longitud = longitud;
        datos = new int[longitud];

        for(int i = 0; i < datos.length; i++){
            if(ini){
                datos[i] = gna.nextInt(2);
            } else {
                datos[i] = GEN_POR_DEFECTO;
            }
        }
    }

    public int getGen(int i){
        if(i >= longitud){
            throw new IndexOutOfBoundsException("Position is not valid");
        }
        return datos[i];
    }

    public void setGen(int pos, int val){
        if (val > 1 || val < 0) {
            throw new RuntimeException("Error gen number is wrong");
        } else if (pos < 0 || pos > datos.length) {
                throw new RuntimeException("Incorrect position");
        }
        datos[pos] = val;
    }

    public int getLongitud(){
        return datos.length;
    }

    public void mutar(double prob){
        if ((prob < 0) && (prob > 1)){
            throw new IllegalArgumentException("Values are not valid");
        }
        for (int i = 0; i < datos.length; i++) {
            if(gna.nextDouble() < prob) {
                datos[i] ^= 1;
            }
        }
    }

    public Cromosoma copia(){
        if (this.datos == null) {
            throw new RuntimeException(
                    "Error!You cannot create sth that is not created! ");
        } else {
            Cromosoma salida = new Cromosoma(this.getLongitud(), true);
            salida.datos = this.datos.clone();
            return salida;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < datos.length - 1; i++) {
            s.append(datos[i]).append(", ");
        }
        return "[" + s + datos[datos.length - 1] + "]";
    }
}
