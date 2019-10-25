package org.uma.mbd.mdEjemplo;

import org.uma.mbd.mdHospitalV1L.mdhospitalv1l.Genero;
import org.uma.mbd.mdHospitalV1L.mdhospitalv1l.Persona;

import java.util.Scanner;

public class prueba_scanner {

    public static void main(String[] args) {
        String datos = "Juan García,23.Pedro González:,15.Luisa López-19.Andrés Molina,-22";
        try (Scanner sc = new Scanner(datos)) {
            sc.useDelimiter("[.]+"); // un punto una o más veces while (sc.hasNext()) {
            String datoPersona = sc.next();
            try (Scanner scPersona = new Scanner(datoPersona)) {
                scPersona.useDelimiter("[,:-]+");
                String nombre = scPersona.next();
                int edad = scPersona.nextInt();

            }
        }
    }
}