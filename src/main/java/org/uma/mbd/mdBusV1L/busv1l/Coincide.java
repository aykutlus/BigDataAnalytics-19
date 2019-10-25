package org.uma.mbd.mdBusV1L.busv1l;

public class Coincide implements Criterio {

    private Bus bus;

    public Coincide(Bus bus){
        this.bus=bus;
    }

    @Override
    public boolean esSeleccionable(Bus bus) {
        return this.bus.equals(bus);
    }

    @Override
    public String toString(){
        return "autobus" + bus;
    }
}