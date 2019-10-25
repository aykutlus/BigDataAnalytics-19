package org.uma.mbd.mdHospitalV2L.hospitalv2l;

import java.util.ArrayList;
import java.util.List;

public class Planta {

    private String codigo;
    List<Habitacion> habitaciones;

    public Planta(int numHab, String codigo) {
        this.codigo = codigo;
        habitaciones = new ArrayList<>();
        for (int i = 0; i < numHab; i++) {
            habitaciones.add(new Habitacion(4, codigo + "H" + i));
        }
    }
    public Habitacion getHabitacion(int n){
        if (n >= habitaciones.size()){
            throw new IndexOutOfBoundsException("habitacion" + n + "no encontrada" );
        }
        return habitaciones.get(n);
    }
    public int numHabitaciones(){
        return habitaciones.size();
    }
    private int indexHabitacion(){
        int i = 0;
        while(i < habitaciones.size() && !habitaciones.get(i).hayCamaLibre()){
            i++;
        }
        return i;
    }

    public boolean hayCamaLibre(){
        int i = indexHabitacion();
        return i != habitaciones.size();
    }
    public Cama camaLibre(){
        if(!hayCamaLibre()){
            throw new RuntimeException("No hay camas libres");
        }
        int i = indexHabitacion();
        return habitaciones.get(i).camaLibre();
    }

    public String toString(){
        return "Planta " + codigo + "[" + habitaciones + "]";
    }
}



