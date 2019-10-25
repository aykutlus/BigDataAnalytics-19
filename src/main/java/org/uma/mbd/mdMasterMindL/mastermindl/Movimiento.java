package org.uma.mbd.mdMasterMindL.mastermindl;

import java.util.Objects;

public class Movimiento {

    private String cifras;
    private int colocadas;
    private int descolocadas;

    public String getCifras() {
        return cifras;
    }

    public int getColocadas() {
        return colocadas;
    }

    public int getDescolocadas() {
        return descolocadas;
    }


    public Movimiento(String cifras, int colocadas, int descolocadas) {
        this.cifras = cifras;
        this.colocadas = colocadas;
        this.descolocadas = descolocadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movimiento)) return false;
        Movimiento that = (Movimiento) o;
        return cifras.equals(that.cifras);
    }

    /*public boolean equals(Object o){
        boolean res= o instanceof  Movimiento;
        Movimiento that = res?(Movimiento)o:null;
        return res&&cifras.equals(that.cifras);
    }*/

    @Override
    public int hashCode() {
        return cifras.hashCode();
    }

    @Override
    public String toString() {
        return "[" + cifras + ',' + colocadas + "," +  descolocadas + "]";
    }

}
