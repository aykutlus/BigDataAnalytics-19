package org.uma.mbd.mdCoches.coches;

public class CocheImportado extends Coche {
    private double homologacion;

    public CocheImportado(String n,double p, double h){
        super(n,p);
        homologacion = h;
    }

    public double precipTotal(){
       // return precio + precio*PIVA + homologacion ;  ** no se puede hacer
        return super.precioTotal() + homologacion;
    }


}
