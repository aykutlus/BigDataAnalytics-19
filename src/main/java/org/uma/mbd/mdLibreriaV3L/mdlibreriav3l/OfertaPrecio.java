package org.uma.mbd.mdLibreriaV3L.mdlibreriav3l;

public class OfertaPrecio implements OfertaFlex {

    private double porDescuento;
    private double umbralPrecio;

    public OfertaPrecio(double porDescuento, double umbralPrecio) {
        this.porDescuento = porDescuento;
        this.umbralPrecio = umbralPrecio;
    }

    @Override
    public double getDescuento(Libro libro){
        double descuento=0;
        if (libro.getPrecioBase() >= umbralPrecio){
            descuento = porDescuento;
        }
        return descuento;
    }


}
