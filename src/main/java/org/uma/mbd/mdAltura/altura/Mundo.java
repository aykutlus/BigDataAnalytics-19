package org.uma.mbd.mdAltura.altura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Mundo {

    private List<Pais> paises; //private yazmayı unutmuşsun

    public Mundo() {
        paises = new ArrayList<>();
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void leePaises(String file) throws FileNotFoundException{
        try (Scanner sc = new Scanner(new File(file))){
            leePaises(sc);
        }
    }
    private void leePaises(Scanner sc) {
        while (sc.hasNextLine()) {
            String datosPais = sc.nextLine();
            try (Scanner scLinea = new Scanner(datosPais)) {
                scLinea.useDelimiter(",");
                sc.useLocale(Locale.ENGLISH);
                String n = scLinea.next();
                String c = scLinea.next();
                double alt = scLinea.nextDouble();
                Pais pais = new Pais(n, c, alt);
                paises.add(pais);
            }


        }
    }

       /*
            stringToPais(datosPais);
        }
    }
    private void stringToPais(String datos){
        try (Scanner sc=new Scanner(datos)){
            sc.useDelimiter(",");
            String p1 =sc.next();
            String p2 = sc.next();
            int p3= sc.nextInt();
            Pais pais = new Pais(p1,p2,p3);
            paises.add(pais);
        }
    }*/

    public List<Pais> selecciona(Seleccion seleccion){
        List<Pais> res = new ArrayList<>();
        for (Pais pais: paises){
            if (seleccion.test(pais)){
                res.add(pais);
            }
        }
        return res;

    }
    public Map<String,Integer> numPaisesPorContinente(){
        Map<String,Integer> map = new HashMap<>();
        for(Pais pais:paises){
            int veces map.getOrDefault(pais.getContiene(),0);
        }
    }

}
