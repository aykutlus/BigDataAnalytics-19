package org.uma.mbd.mdLibreriaV2L.libreriav2l;

import java.util.Arrays;

public class LibreriaOferta extends Libreria {

    private String[] oferta;
    private double descuento;

    public LibreriaOferta() {
    }

    public LibreriaOferta(double descuento, String[] oferta) {
        //super();   ==> koyulabilir görmen için
        this.oferta = oferta;
        this.descuento = descuento;
    }

    public String[] getOferta() {
        return oferta;
    }

    public void setOferta(double descuento, String[] oferta) {
        this.descuento = descuento;
        this.oferta = oferta;
    }

    public double getDescuento() {
        return descuento;
    }

    /*@Override
    public void addLibro(String a,String t,double p){
        if (esAutorEnOferta(a)){
            LibroOferta libro = new LibroOferta(a,t,p,descuento);
            addLibro(libro);
        } else {
            Libro libro = new Libro(a,t,p);
            addLibro(libro);
        }
    }*/

    @Override  // burada polimorfizm ile yaptım. libro libro kısmında poli var addlibro her seyin altına eklendi
    public void addLibro(String a,String t,double p){
        Libro libro;
        if (esAutorEnOferta(a)){
            libro = new LibroOferta(a,t,p,descuento);
        } else {
            libro = new Libro(a,t,p);
            addLibro(libro);
        }
        addLibro(libro);
    }

   /*private boolean esAutorEnOferta(String aut) {
       for (String element : oferta) {
           if (element.equalsIgnoreCase(aut)) {
               return true;
           } else {
               return false;
           }*/

    private boolean esAutorEnOferta(String aut){
        int i=0;
        while (i <oferta.length && !aut.equalsIgnoreCase(oferta[i])){
            i++;
        }
        return i < oferta.length;
           }


     @Override
    public String toString(){
        return descuento + "%;" + Arrays.toString(oferta) + super.toString();

   }
}