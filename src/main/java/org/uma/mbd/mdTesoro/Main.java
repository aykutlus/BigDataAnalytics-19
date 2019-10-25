package org.uma.mbd.mdTesoro;

import org.uma.mbd.mdRectas.rectas.Punto;
import org.uma.mbd.mdTesoro.tesoro.Tesoro;

public class Main {


    public static void main(String[] args) {

        Punto pam = new Punto(0,10);
        Punto paz = new Punto(0,10);
        Punto prosa= new Punto(0,0);

        Tesoro t1 =  new Tesoro(pam,paz,prosa);
        System.out.println(t1);

        Punto Eam = t1.getE_amarilla();
        System.out.println(Eam);


    }

}


