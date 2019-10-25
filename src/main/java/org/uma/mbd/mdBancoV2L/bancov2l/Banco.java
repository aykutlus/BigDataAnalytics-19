package org.uma.mbd.mdBancoV2L.bancov2l;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final int PRIMER_NUM_CTA = 1001;
    private String nombre;
    private int snc;
    private List<Cuenta> ctas;

    public Banco(String name,int n) {
        nombre = name;
        snc = PRIMER_NUM_CTA;
        ctas = new ArrayList<>();
    }

    public int abrirCuenta(String name, double money) {
        ctas.add(new Cuenta(name, snc, money));
        snc++;
        return snc - 1;
    }

    public int abrirCuenta(String name) {
        return this.abrirCuenta(name, 0);
    }

    public int abrirCuentaVIP(String tit,double saldoInicial,double incentivo){
        ctas.add(new CuentaVIP(tit,saldoInicial,snc,incentivo));
        snc++;
        return snc-1;
    }

    public void cierreEjercicio(){
        for(int i=0; i<ctas.size(); i++ ){
            ctas.get(i).cierreEjercicio();
        }
    }
    public List<Integer> abrirCuentas(List<String> tit){
        List<Integer> salida = new ArrayList<>();
        for (int i =0;i<tit.size();i++){
            ctas.add(new Cuenta(tit.get(i),snc,0));
            salida.add(snc);
            snc++;
        }
        return salida;
    }

    public void cerrarCuentas(List<Integer> numCuentas) {
        for (int i = 0; i < numCuentas.size(); i++) {
            try {
                ctas.remove(posicionCuenta(numCuentas.get(i)));
            } catch (RuntimeException e) {
            }
        }
    }

    public void cerrarCuenta(int n) {
        int i = posicionCuenta(n);
        ctas.remove(i);
    }
    private int posicionCuenta(int n) {
        int i = 0;
        while (i < ctas.size() && !(ctas.get(i).getNumCuenta() == n)) {
            i++;
        }
        if (i == ctas.size()) {
            throw new RuntimeException("no existe la cuenta dada");
        }
        return i;
    }
    public void ingreso(int n,double money){
        int i = posicionCuenta(n);
        ctas.get(i).ingreso(money);
    }
    public void debito(int n,double money){
        int i = posicionCuenta(n);
        if (ctas.get(i).getSaldo() < money) {
            ctas.get(i).debito(ctas.get(i).getSaldo());
        }else{
            ctas.get(i).debito(money);
        }
    }
    public double saldo(int n){
        int i = posicionCuenta(n);
        return ctas.get(i).getSaldo();
    }
    public void transferencia(int n1,int n2,double money){
        int i = posicionCuenta(n1);
        int j= posicionCuenta(n2);
        ctas.get(i).ingreso(money);
        ctas.get(i).debito(money);
    }


    @Override
    public String toString(){
        return ctas.toString();
    }
}






