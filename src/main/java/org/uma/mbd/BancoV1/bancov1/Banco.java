package org.uma.mbd.BancoV1.bancov1;

import java.util.Arrays;

public class Banco {

    private static final int TAM_ARRAY_CTAS = 10;
    private static final int PRIMER_NUM_CTA = 1001;
    private String nombre;
    private int ppl;
    private int snc;
    private Cuenta[] ctas;


    public Banco(String nombre){
        this(nombre, TAM_ARRAY_CTAS);
    }

    public Banco(String nombre, int n) {
        ctas = new Cuenta[n];
        this.nombre = nombre;
        ppl = 0;
        snc = PRIMER_NUM_CTA;
    }

    private int posicionCuenta(int n) {
        int i = 0;
        while ((i < ppl) && !(ctas[i].getNumCuenta() == n)) {
            i++;
        }
        if (i == ppl) {
            throw new RuntimeException("No existe la cuenta dada");
        }
        return i;
    }

    public int abrirCuenta(String nombre) {
        return this.abrirCuenta(nombre, 0);
    }

    public int abrirCuenta(String nombre, double saldo) {
        if (ppl == ctas.length) {
            ctas = Arrays.copyOf(ctas, ppl * 2);
        }
        ctas[ppl] /*yeni hesap*/ = new Cuenta(nombre, snc, saldo);
        ppl++;
        snc++;
        return snc - 1;
    }

    public void cerrarCuenta(int n) {
        int i = posicionCuenta(n);
        for (int j = i; j < ppl - 1; j++) {
            ctas[j] = ctas[j + 1];
        }
        ppl--;
    }

    public void ingreso(int n, double money) {
        int i = posicionCuenta(n);
        ctas[i].ingreso(money);
    }

    public void debito(int ncuenta, double money) {
        int i = posicionCuenta(ncuenta);
        if (ctas[i].getSaldo() < money) {
            ctas[i].debito(ctas[i].getSaldo());
        } else {
            ctas[i].debito(money);
        }

    }

    public double saldo(int ncuenta) {
        int i = posicionCuenta(ncuenta);
        return ctas[i].getSaldo();
    }

    public void transferencia(int ncuenta1, int ncuenta2, double money) {
        int i = posicionCuenta(ncuenta1);
        int j = posicionCuenta(ncuenta2);
        ctas[i].ingreso(money);
        ctas[j].debito(money);

    }

}

