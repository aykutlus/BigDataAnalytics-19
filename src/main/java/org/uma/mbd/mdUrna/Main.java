package org.uma.mbd.mdUrna;

import org.uma.mbd.mdUrna.urna.Urna;

public class Main {

    public static void main(String [] args) {

        try {
            String s1 = args[0];
            String s2 = args[1];
            int nb = Integer.parseInt(s1);
            int nn = Integer.parseInt(s2);
            Urna u = new Urna(20, 1);
            while (u.totalBolas() > 1) {
                Urna.ColorBola b1 = u.extraerBola();
                Urna.ColorBola b2 = u.extraerBola();
                if (b1 == b2) {
                    u.ponerBlanca();
                } else {
                    u.ponerNegra();
                }
            }
                System.out.println(u.extraerBola());

            }

        catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Error en la entrada de datos. Debes proporcionar dos argumentos");
        }catch (NumberFormatException e) {
            System.err.println("Algun dato no es numerico" + e.getMessage());
        }finally {
            System.err.println("No se como habra ido pero adios");
        }
        System.err.println("y esto que?");

        }
    }