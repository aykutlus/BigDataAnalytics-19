package org.uma.mbd.mdBancoV2L.bancov2l;

public class CuentaVIP extends Cuenta{
    private double incentivo;

    public CuentaVIP(String titular, double saldo,int numCuenta, double incentivo) {
        super(titular, numCuenta, saldo);
        this.incentivo = incentivo;
    }

    public void cierreEjercicio(){
        super.cierreEjercicio();
        super.ingreso(incentivo);
    }


    @Override
    public String toString(){
        return super.toString() + "$" + incentivo + "$";
    }
}
