package org.uma.mbd.mdMasterMindL.mastermindl;

import java.util.Random;

public class MasterMind {

    private static final int TAMANO_POR_DEFECTO=4;
    private static Random alea = new Random();
    private String secreto;
    private int longitud;

    public MasterMind(){
        this(TAMANO_POR_DEFECTO);
    }

    public MasterMind(int n){
        if (n<1 || n>9){
            throw new MasterMindException("Tamano de juego ilegal" + n);
        }
        longitud = n;
        generaCombinacionSecreta(n);
    }
    public MasterMind(String cifras){
        longitud=cifras.length();
        if(!validaCombinacion(cifras)){
            throw new MasterMindException("secreto no valido" + cifras);
        }
        secreto = cifras;
    }

    private void generaCombinacionSecreta(int n){
        secreto = "";
        while (secreto.length() < n ){
            int cifra = alea.nextInt(10);
            String cifraStr = Integer.toString(cifra);
            if (!secreto.contains(cifraStr)){
                secreto += cifraStr;
            }
        }

    }
    private boolean validaCombinacion(String cifras){
        boolean valido = cifras.length() == longitud;
        if (valido) {
            valido = cifras.matches("[0-9]+");
        }
        if (valido){
            int i = 0;
            while (valido && i<longitud-1){
                String cifraStr = Character.toString(cifras.charAt(i));
                valido = !cifras.substring(i+1).contains(cifraStr);
                i++;
            }
        }
        return valido;
    }
    public Movimiento intento(String cifras){
        if (!validaCombinacion(cifras)){
            throw new MasterMindException("cifras no validas" + cifras);
        }
        int col = 0;
        int des = 0;
        for (int i =0; i<longitud;i++){
            if (cifras.charAt(i) == secreto.charAt(i)){
                col++;
            }else if (secreto.indexOf(cifras.charAt(i)) >= 0){
                des++;
            }
        }
        return new Movimiento(cifras,col,des);
    }


}
