package org.uma.mbd.mdJarras.jarras;

public class Mesa {

    private Jarra jarraA;
    private Jarra jarraB;

    public Mesa(int ca, int cb) {
        jarraA = new Jarra(ca);
        jarraB = new Jarra(cb);
    }

    public void llenaA() {
        jarraA.llena();
    }

    public void llenaB() {
        jarraB.llena();
    }

    public void vaciaA() {
        jarraA.vacia();
    }

    public void vaciaB() {
        jarraB.vacia();
    }

    public void volcarASobreB() {
        jarraB.llenaDesde(jarraA);
    }

    public void volcarBSobreA() {
        jarraA.llenaDesde(jarraB);
    }

    public int getContenidoA() {
        return jarraA.getContenido();
    }

    public int getContenidoB() {
        return jarraA.getContenido();
    }

    public int getContenido() {
        return jarraA.getContenido() + jarraB.getContenido();
    }

    public int getCapacidadA() {
        return jarraA.getCapacidad();
    }

    public int getCapacidadB() {
        return jarraB.getCapacidad();
    }


    public String toString(){

        return "M("+jarraA+","+jarraB+")";
    }
}


