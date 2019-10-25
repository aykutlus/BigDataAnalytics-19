package org.uma.mbd.mdHospitalV2L.hospitalv2l;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {

    private List<Cama> camas = new ArrayList<>();
    private String codigo;

    public Habitacion(int nCamas, String cod){
        codigo = cod;
        for (int i = 0; i < nCamas; i++) {
            camas.add(new Cama(codigo+"C"+i));
        }
    }

    public Cama getCama(int n){
        if(!camas.get(n).estaLibre()) {
            throw new RuntimeException("Cama ocupada");
        }
        return camas.get(n);
    }

    public int numCamas(){
        return camas.size();
    }

    private int indexCama(){
        int i = 0;
        while(i < camas.size() && !camas.get(i).estaLibre()){
            i++;
        }
        return i;
    }

    public boolean hayCamaLibre(){
        int i = indexCama();
        return i != camas.size();
    }

    public Cama camaLibre(){
        if(!hayCamaLibre()){
            throw new RuntimeException("No hay camas libres");
        }
        int i = indexCama();
        return camas.get(i);
    }

    public String toString(){
        return "Habitacion " + codigo + "[" + camas + "]";
    }
}




