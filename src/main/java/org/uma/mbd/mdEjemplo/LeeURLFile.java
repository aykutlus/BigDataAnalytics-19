package org.uma.mbd.mdEjemplo;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*public class LeeURLFile {


    public static void main(String[] args) throws IOException {
        String urlPath = "http://datosabiertos.malaga.eu/recursos/transporte" + "/EMT/EMTLineasUbicaciones/lineasyubicaciones.csv";

        URL url = new URL(urlPath);

        try (InputStream fs = url.openStream();
             InputStreamReader isr = new InputStreamReader(fs);
             BufferedReader br = new BufferedReader(isr);
             CSVReader csv = new CSVReader(br){
            csv.readNext();
             for (String[] datosbus: csv.readAll()){
                     System.out.print("codbus:" + datosbus[0]);
                     System.out.print("codlin:" + datosbus[1]);
                     System.out.print("lon:" + datosbus[3]);
                     System.out.print("lat:" + datosbus[4]);

                 }

                 /*
                 csv.readNext();
            String [] datosbus = csv.readNext();
            while (datosbus != null){
                System.out.print("codbus:" + datosbus[0]);
                System.out.print("codlin:" + datosbus[1]);
                System.out.print("lon:" + datosbus[3]);
                System.out.print("lat:" + datosbus[4]);
                datosBus = csv.readNext();

            }
*/



