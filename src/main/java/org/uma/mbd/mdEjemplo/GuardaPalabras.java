package org.uma.mbd.mdEjemplo;

import java.io.IOException;
import java.io.PrintWriter;

public class GuardaPalabras {

    public static void main(String[] args) {

        String fichero = "src/main/java/org/uma/mbd/mdEjemplo/datos.txt";
        try (PrintWriter pw = new PrintWriter(fichero)) {
            pw.println("amor roma mora ramo");
            pw.println("rima mira");
            pw.println("rail liar");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: falta el nombre del fichero"); } catch (IOException e) {
        } }

    }

    // crear un fichero de palabras


