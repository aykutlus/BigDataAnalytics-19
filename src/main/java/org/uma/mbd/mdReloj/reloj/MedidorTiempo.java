package org.uma.mbd.mdReloj.reloj;

public class MedidorTiempo {

    private RelojArena izdo;
    private RelojArena drcho;
    private int tiempototal;

    public MedidorTiempo(int a, int b) {
        izdo = new RelojArena(a);
        drcho = new RelojArena(b);

    }

    public void giraIzquierdo() {
        izdo.gira();
    }

    public void giraDerecho() {
        drcho.gira();
    }

    public int getTiempoTotal() {
        return tiempototal;
    }

    public void pasaTiempo() {
        if (izdo.getTiempoRestante() == 0) {
            tiempototal += izdo.getTiempoRestante();
        }
        if (drcho.getTiempoRestante() == 0) {
            tiempototal += drcho.getTiempoRestante();
        }
        if (drcho.getTiempoRestante() != 0) {
        }
        if (izdo.getTiempoRestante() != 0) {
        }
    }

    public String toString() {
        return "R(" + izdo + "," + drcho + "," + tiempototal +")";
    }

}










