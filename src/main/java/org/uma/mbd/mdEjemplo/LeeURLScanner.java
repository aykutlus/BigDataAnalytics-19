package org.uma.mbd.mdEjemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class LeeURLScanner {

    public static void main(String[] args) throws IOException {
        String urlPath = "http://datosabiertos.malaga.eu/recursos/transporte" + "/EMT/EMTLineasUbicaciones/lineasyubicaciones.csv";

        URL url = new URL(urlPath);

        try (Scanner sc = new Scanner(url.openStream())){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
    }
}
