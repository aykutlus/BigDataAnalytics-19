package org.uma.mbd.mdJarrazMezcla.jarramezcla;

import org.uma.mbd.mdJarras.jarras.Jarra;

public class JarraMezcla extends Jarra {

    private double pureza;
    private static final double AGUA =0;
    private static final double VINO=100;


    public JarraMezcla(int capacidad) {
        super(capacidad);
        this.pureza = AGUA; }

    public static double calculaPureza(int cp1, double p1, int cp2, double p2){
        return(cp1*p1)+(cp2*p2)/(cp2+cp1); }

    @Override
    public void llena(){
        pureza = calculaPureza(getContenido(),pureza,getCapacidad()-getContenido(),AGUA);
        super.llena(); }

    public void llenaVino(){
        pureza = calculaPureza(getContenido(),pureza,getCapacidad()-getContenido(),VINO);
        super.llena();
    }
    @Override
    public void llenaDesde(Jarra j){
        int trasvasar = Math.min(getCapacidad()-getContenido(),j.getContenido());
        pureza = calculaPureza(getContenido(),pureza,trasvasar,AGUA);
        super.llenaDesde(j); }

    public void llenaDesde(JarraMezcla jm){
        int trasvasar = Math.min(getCapacidad()-getContenido(), jm.getContenido());
        pureza = calculaPureza(getContenido(),pureza,trasvasar,jm.pureza);
        super.llenaDesde(jm);
    }
    @Override
    public String toString(){
        return super.toString() + pureza;
    }

}
