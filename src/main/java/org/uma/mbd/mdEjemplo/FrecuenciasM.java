package org.uma.mbd.mdEjemplo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrecuenciasM {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();

        Map<String, Integer> frecs = new HashMap<>();

        Scanner scN = new Scanner(frase);
        while (scN.hasNext()) {
            frecs.put((scN.next());
        }

        for (String arg : args) {
        int frec = frecs.getOrDefault(arg, 0);
        frecs.put(arg, frec + 1);
    }
    for (String valor: frecs.keySet()) {
        int frec = frecs.get(valor);
        char[] barra = new char[frec];
        Arrays.fill(barra, '*');
        System.out.println(valor + ":" + new String(barra));
    }
    }
}
