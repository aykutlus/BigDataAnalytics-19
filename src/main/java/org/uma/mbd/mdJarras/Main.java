package org.uma.mbd.mdJarras;

import org.uma.mbd.mdJarras.jarras.Mesa;

public class Main {

    public static void main(String[] args){

        Mesa mesa = new Mesa(7,5);
        mesa.llenaA();
        mesa.volcarASobreB();
        mesa.vaciaB();
        mesa.volcarASobreB();
        System.out.println(mesa);
    }
}
