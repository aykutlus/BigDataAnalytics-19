package org.uma.mbd.mdBancoV2L.bancov2l;

public class Cuenta {

    private int numCuenta;
    private String titular;
    private double saldo;
    private static final double porcentaje = 0.02;



    public Cuenta(String titular, int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;

    }

    public Cuenta(String titular,int numCuenta) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingreso(double money){
        saldo += money;
    }
    public void debito(double money){
        saldo -= money;
    }

    public void cierreEjercicio(){
        saldo += getSaldo()*porcentaje;
    }

    @Override
    public String toString() {
        return "Cuenta(" + "numCuenta: " + numCuenta + ", Saldo: " + saldo + ", Titular: '" + titular + ')';
    }
}
