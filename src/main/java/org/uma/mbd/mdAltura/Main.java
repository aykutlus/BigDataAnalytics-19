package org.uma.mbd.mdAltura;

import org.uma.mbd.mdAltura.altura.EnContinente;
import org.uma.mbd.mdAltura.altura.MenoresQue;
import org.uma.mbd.mdAltura.altura.Mundo;
import org.uma.mbd.mdAltura.altura.Pais;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]) throws FileNotFoundException {
        Mundo paises = new Mundo();
        paises.leePaises("recursos/mdAlturas/alturas.txt");
        for (Pais pais : paises.selecciona(new MenoresQue(1.70))) {
            System.out.println(pais);
        }



        Comparator<Pais> comCon = (p1,p2) -> p1.getContiene().compareTo(p2.getContiene());
        Comparator<Pais> comNom = (p1,p2) -> p1.getNombre().compareTo(p2.getNombre());
        Comparator<Pais> comAlt = (p1,p2) -> Double.compare(p1.getAltura(),p2.getAltura());

        Comparator<Pais> comcpn = comCon.thenComparing(comAlt).thenComparing(comNom);
        Set<Pais> set1 = new TreeSet<>(comcpn);
        set1.addAll(paises.selecciona(new MenoresQue(1.70)));
        set1.forEach(System.out::println);

        System.out.println();

       for (Pais pais : paises.selecciona(new EnContinente("Europe"))) {
            System.out.println(pais);
        }

        System.out.println();
       Comparator<Pais> compadn = comAlt.reversed().thenComparing(comNom);
       Set<Pais> set2 = new TreeSet<>(compadn);
       set2.addAll(paises.selecciona(new EnContinente("europea")));
       set2.forEach(System.out::println);



        for (Pais pais : paises.selecciona(p -> p.getAltura() < 1.65)) {
        }



        paises.selecciona(p -> p.getAltura() < 1.65) // bu bir lista de paises. üsteki for ile aynı şey demek
                .forEach(p-> System.out.println(p));
                //.forEach(System.out::println); üstekinin daha kısa hali

        System.out.println("con stream");
        paises.getPaises().stream().filter(p->p.getAltura() < 1.65)
                .forEach(System.out::println);

        paises.numPaisesPorContinente().forEach((k,v) -> System.out.println(k + "->" + v));


    }


}

