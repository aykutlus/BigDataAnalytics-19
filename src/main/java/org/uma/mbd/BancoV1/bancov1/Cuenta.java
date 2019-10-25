package org.uma.mbd.BancoV1.bancov1;

public class Cuenta {

    private int numCuenta;
    private double saldo;
    private String titular;

    public Cuenta(String titular, int numCuenta,double saldo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    public Cuenta(String titular,int numCuenta) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void ingreso(double ing){
        saldo += ing;
    }
    public void debito(double deb){
        saldo -= deb;
    }

    @Override
    public String toString() {
        return "Cuenta(" + "numCuenta: " + numCuenta + ", Saldo: " + saldo + ", Titular: '" + titular + ')';
    }





}
