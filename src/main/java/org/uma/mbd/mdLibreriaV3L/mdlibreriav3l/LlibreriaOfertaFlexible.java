package org.uma.mbd.mdLibreriaV3L.mdlibreriav3l;

public class LlibreriaOfertaFlexible extends Libreria {

    private OfertaFlex OfertaFlexible;

    public LlibreriaOfertaFlexible(OfertaFlex ofertaFlexible) {
        OfertaFlexible = ofertaFlexible;
    }

    @Override
    public void addLibro(String a,String t, double p){
        Libro libro = new Libro(a,t,p);
        double descuento = OfertaFlexible.getDescuento(libro);
        if (descuento >0){
            libro = new LibroOferta(a,t,p,descuento);
        }
        addLibro(libro);


    }
}
