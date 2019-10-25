package org.uma.mbd.mdReloj.reloj;

public class RelojArena {

    private int tiempoTotal;
    private int tiempoRestante;

    public RelojArena(int a){
        tiempoRestante = a;
        tiempoTotal = 0;
    }

    public void gira () {
        int temporal = tiempoRestante;
        tiempoRestante = tiempoTotal;
        tiempoTotal = temporal;
    }

    public void pasaTiempo(){
        tiempoRestante += tiempoTotal;
        tiempoTotal= 0 ; }

    public int getTiempoRestante() {
        return tiempoRestante; }


    public void pasaTiempo(RelojArena reloj) {
        if (tiempoTotal >= reloj.tiempoTotal) {
            this.tiempoTotal = tiempoTotal - reloj.tiempoTotal;
            this.tiempoRestante = this.tiempoRestante + reloj.tiempoTotal;
            reloj.tiempoTotal = 0;
            reloj.tiempoRestante += tiempoRestante + reloj.tiempoTotal;
        } else {
            this.tiempoTotal = 0;
            this.tiempoRestante += tiempoTotal;
            reloj.tiempoTotal -= tiempoTotal;
            reloj.tiempoRestante = reloj.tiempoTotal;
        }

    }

       /* public void pasaTiempo (RelojArena reloj) {
            if (tiempoTotal > reloj.tiempoTotal) {

                this.tiempoTotal -= reloj.tiempoTotal;
                this.tiempoRestante += reloj.tiempoTotal;
                reloj.pasaTiempo();
            } else {
                this.pasaTiempo();
                reloj.pasaTiempo();
           }
        }*/

        public String toString () {
            return "R(" + tiempoTotal + "/" + tiempoRestante + ")";
        }
    }