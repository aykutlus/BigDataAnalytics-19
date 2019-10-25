package org.uma.mbd.mdRectas.rectas;

public class Vector {

    private Punto extremo;  /*referencia*/

    public Vector(double a, double b) {

        extremo = new Punto(a,b);
    }
    public Vector(Punto p){

        extremo = p;
    }
    public Vector(Punto p1,Punto p2){
        this(p2.getX()-p1.getX(),p2.getY()-p1.getY());
    }

    public Punto extremoDesde(Punto org)
    {
        Punto nuevo = new Punto(org.getX(), org.getY());
        nuevo.trasladar(extremo.getX(), extremo.getY());
        return nuevo;
    }

    public double getComponenteX(){
        return extremo.getX();
    }

    public double getComponenteY(){
        return extremo.getY();
    }

    public double modulo(){
        return extremo.distancia(new Punto());
    }

    public Vector ortogonal(){
        return new Vector(-getComponenteY(), getComponenteX());
    }

    public boolean paraleloA(Vector otro){
        return getComponenteX()*otro.getComponenteY()==getComponenteY()*otro.getComponenteX();
    }

    public String toString(){
        return "V(" + getComponenteX() + "," + + getComponenteY()+")";
    }
}



