package org.uma.mbd.mdEjemplo;

import java.util.*;

public class Duplicados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();

        Set<String> palabras = new HashSet<>(); //liste oluşturdum

        Scanner scN = new Scanner(frase);

        while (scN.hasNext()) {
            palabras.add(scN.next());
        }
        for(String arg:palabras) {
            if (!palabras.add(arg)  ) {
                System.out.println("duplicado: " + arg);
            }
        }

        System.out.println(palabras.size() + " palabras detectadas: " + palabras);

        }


    }








        /*Set<String> s = new HashSet<>();
        for (String arg : args) {
            if (!s.add(arg)) {
                System.out.println("duplicado: " + arg);
            }
        }
        System.out.println(
                s.size() + " palabras detectadas: " + s);

*/

