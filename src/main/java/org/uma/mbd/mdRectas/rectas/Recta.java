package org.uma.mbd.mdRectas.rectas;

public class Recta {

    private Vector direccion;
    private Punto pto;

    public Recta(Vector v, Punto p) {
        direccion = v;
        pto = p;
    }

    public Recta(Punto p1, Punto p2) {
        this(new Vector(p1, p2), p1); }

    public boolean pasaPor(Punto p) {
        return direccion.paraleloA(new Vector(pto, p)); }

    public boolean paralelaA(Recta r){
        return direccion.paraleloA(r.direccion);
    }

    public Recta parelelaPor(Punto p) {
        return new Recta(direccion, p); }

    public Recta perpendicularPor(Punto p){
        return new Recta(direccion.ortogonal(),p);
    }

    public Punto interseccionCon(Recta r) {
        if (direccion.paraleloA(r.direccion)) {
            throw new RuntimeException("rectas parelelas");
        }

        // todo va bien
        double d = direccion.getComponenteX() * r.direccion.getComponenteY() -
                direccion.getComponenteY() * r.direccion.getComponenteX();

        double d1 = direccion.getComponenteX()*pto.getY()-direccion.getComponenteY()*pto.getX();
        double d2 = r.direccion.getComponenteX()*r.pto.getY()-
                    r.direccion.getComponenteY()*r.pto.getX();
        return new Punto((d1*r.direccion.getComponenteX()-d2*direccion.getComponenteX())/d,
                         (d1*r.direccion.getComponenteY()-d2*direccion.getComponenteY())/d);
    }
    public double distanciaDesde(Punto p){
        Recta r = perpendicularPor(p);
        Punto pi = interseccionCon(r);
        return p.distancia(pi);
    }

    public String toString(){
        return "R(" + direccion +"," + pto+ ")";
    }
}

