package org.uma.mbd.mdJarras.jarras;

public class Jarra {

    private int contenido;
    private int capacidad;


    public Jarra (int a){
        if (a<= 0){
            throw new IllegalArgumentException("valor negativo o 0");
        }
        capacidad = a;
        contenido = 0;
    }


    public int getCapacidad(){
        return capacidad;
    }

    public int getContenido(){
        return capacidad;
    }

    public void llena(){
        capacidad = contenido;

    }
    public void vacia(){
        contenido = 0;

    }
    public void llenaDesde(Jarra j) {
        int cabe = capacidad - contenido;
        if (cabe >= j.contenido) {
            //cabe todo
            this.contenido += j.contenido;
            j.contenido = 0;
        } else {
            // no cabe todo
            this.contenido = capacidad;
            j.contenido -= cabe;
        }

    }
        public String toString() {
            return "J(" + capacidad + "," + contenido +")";

        }


    }



