package org.uma.mbd.mdReloj;

import org.uma.mbd.mdReloj.reloj.MedidorTiempo;
import org.uma.mbd.mdReloj.reloj.RelojArena;

public class Main {

    public static void main(String [] args) {

        RelojArena r1 = new RelojArena(7);
        RelojArena r2 = new RelojArena(5);

        System.out.println(r1);
        System.out.println(r2);
        r1.gira();
        r2.gira();
        System.out.println(r1);
        System.out.println(r2);
        r1.pasaTiempo(r2);
        System.out.println(r1);
        System.out.println(r2);
        r2.gira();
        System.out.println(r2);
        r2.pasaTiempo(r1);
        System.out.println(r2);
        System.out.println(r1);
        r2.gira();
        System.out.println(r2);
        r2.pasaTiempo();
        System.out.println(r2);

        System.out.println("******************");













    }
}
