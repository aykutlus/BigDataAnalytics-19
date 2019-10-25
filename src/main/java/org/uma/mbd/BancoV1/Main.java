package org.uma.mbd.BancoV1;

import org.uma.mbd.BancoV1.bancov1.Banco;

public class Main {

    public static void main(String[] args) {

        Banco b = new Banco("TubbiesBank", 5);
        int nPo = b.abrirCuenta("Po", 500);
        int nDixy = b.abrirCuenta("Dixy", 500);
        int nTinkyWinky = b.abrirCuenta("Tinky Winky", 500);
        int nLala = b.abrirCuenta("Lala", 500);
        int nNono = b.abrirCuenta("Nono");
        System.out.println(b);
        b.ingreso(nPo, 100);
        b.ingreso(nNono, 300);
        b.debito(nDixy, 100);
        b.transferencia(nTinkyWinky, nLala, 100);
        System.out.println(b);
        b.cerrarCuenta(nNono);
        b.cerrarCuenta(nPo);
        b.ingreso(nDixy,200);
        System.out.println(b);
    }
}




