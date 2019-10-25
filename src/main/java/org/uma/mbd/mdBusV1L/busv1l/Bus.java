package org.uma.mbd.mdBusV1L.busv1l;

public class Bus {

    private int codLinea;
    private int codBus;
    private String matricula;

    public Bus(int codBus, String matricula) {
        this.codBus = codBus;
        this.matricula = matricula;
    }

    public void setCodLinea(int codLinea){
        this.codLinea =codLinea; //???????? sor
    }

    public int getCodLinea() {
        return codLinea;
    }

    public int getCodBus() {
        return codBus;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = obj instanceof Bus;
        Bus b = res ? (Bus)obj : null;
        return res && (this.codBus==b.codBus) && (this.matricula.equalsIgnoreCase(b.matricula));
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(codBus) + matricula.toLowerCase().hashCode(); // çünkü yukarda ignore case koydum
    }

    @Override
    public String toString(){
        return "Bus(" + codBus +"," + matricula +"," + codLinea + ")";
    }



}
