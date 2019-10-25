package org.uma.mbd.mdLibreriaV3L.mdlibreriav3l;

public class OfertaAutor implements OfertaFlex {
    private String[] autores;
    private double porDescuento;

    public OfertaAutor(String[] autores, double porDescuento) {
        this.autores = autores;
        this.porDescuento = porDescuento;
    }

   /* @Override
    public double getDescuento(Libro libro) {
        double descuento = 0;
        if (esAutorEnOferta(libro.getAutor())) {
            descuento = porDescuento;
        } else {
            return 0;
        }
    } */

    public double getDescuento(Libro libro) {
        return esAutorEnOferta(libro) ? porDescuento : 0;
    }
    private boolean esAutorEnOferta(Libro libro){
        int i=0;
        while(i < autores.length && ! libro.getAutor().equalsIgnoreCase(autores[i])) {
            i++;
        }
        return i < autores.length;
    }
}

