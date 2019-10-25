package org.uma.mbd.mdTesoro.tesoro;

import org.uma.mbd.mdRectas.rectas.Punto;
import org.uma.mbd.mdRectas.rectas.Vector;

public class Tesoro {

    private Punto p_amarilla;
    private Punto p_azul;
    private Punto p_rosa;


   private Punto e_amarilla;
   private Punto e_azul;
   private Punto tesoro;

    public Tesoro (Punto p1, Punto p2, Punto p3){
        p_amarilla=p1;
        p_azul=p2;
        p_rosa=p3;
        calculoPosiciones();
    }

    public void calculoPosiciones(){
        Vector vector1 = new Vector(p_amarilla,p_rosa);
        Vector ortogonal = vector1.ortogonal();
        Vector vector2 = new Vector(p_azul,p_rosa);
        Vector ortogonal2 = vector2.ortogonal();
        ortogonal2=ortogonal2.ortogonal();
        ortogonal2=ortogonal2.ortogonal();

        e_amarilla =  ortogonal.extremoDesde(p_amarilla) ;
        e_azul = ortogonal2.extremoDesde(p_azul);
        Vector v2 = new Vector(e_amarilla,e_azul);


        Vector v3 = new Vector(new Punto(v2.getComponenteX()/2,v2.getComponenteY()/2));
        tesoro = v3.extremoDesde(e_amarilla);


    }

    public String toString(){
        return "T(" + tesoro + ")";
    }

    public void setP_azul(Punto p){
        p=p_azul;
    }
    public void setP_rosa(Punto p){
        p_rosa=p;
    }

    public Punto getE_amarilla() {
        return e_amarilla;
    }
    public Punto getE_azul(){
        return e_azul;
    }
    public Punto getTesoro(){
        return tesoro;
    }
}
