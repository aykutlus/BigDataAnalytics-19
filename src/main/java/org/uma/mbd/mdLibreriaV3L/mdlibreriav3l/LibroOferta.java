package org.uma.mbd.mdLibreriaV3L.mdlibreriav3l;

public class LibroOferta extends Libro {

    private double descuento;
    private double precioFinal;
    private static double IVA=10;

    public LibroOferta(String autor, String tit, double pb,double desc) {
        super(autor, tit, pb);
        this.descuento=desc;
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioFinal() {
        double px = getPrecioBase() - ( getPrecioBase()* descuento/100);
        return precioFinal = precioFinal + (px * getIVA()/100);
    }

    @Override
    public String toString() {
        return "(" + getAutor() + ";" + getTitulo() + ";" +
                ";Precio BASE" + getPrecioBase() + ";Descuento" + descuento + "%" + ";Precio Final=" + getPrecioFinal() + ')';
    }
}
