package org.uma.mbd.mdLibreria.libreria;

import java.util.Arrays;
import java.util.StringJoiner;

public class Libreria {

    private Libro[] libros;
    private int numLibros;
    private static final int TAM_DEFECTO = 16;


    public Libreria() {
        this(TAM_DEFECTO);
    }

    public Libreria(int n) {
        libros = new Libro[n];
        numLibros = 0;
    }

    public void addLibro(String aut, String tit, double pb) {
        Libro libro = new Libro(aut, tit, pb);
        addLibro(libro);
    }

    private void addLibro(Libro libro) {
        int i = posicionLibro(libro.getAutor(),libro.getTitulo() );
        if (i < 0) {
            aseguraQueCabe();
            libros[numLibros] = libro;
            numLibros++;
        } else {
                libros[i] = libro;
            }

        }


        private int posicionLibro (String aut, String tit){
            int pos = 0;
            while (pos < numLibros &&
                    !(aut.equalsIgnoreCase(libros[pos].getAutor()) &&
                            tit.equalsIgnoreCase(libros[pos].getTitulo()))) {
                pos++;
            }
            return (pos == numLibros) ? -1 : pos;  //doğru olduğunda -1 sonuç olmadığında pos sonuç
        }


        private void aseguraQueCabe () {
            if (numLibros == libros.length) {
                libros = Arrays.copyOf(libros, numLibros * 2);
            }

        }

        public void remLibros (String aut, String tit){
            int pos = posicionLibro(aut, tit);
            if (pos >= 0) {
                for (int i = pos + 1; i < numLibros; i++) {
                    libros[i - 1] = libros[i];
                }
                numLibros--;

            }
        }

        public double getPrecioBase (String aut, String tit){
            int pos = posicionLibro(aut, tit);
            return (pos >= 0) ? libros[pos].getPrecioBase() : 0;
        }

        public double getPrecioFinal (String aut, String tit){
            int pos = posicionLibro(aut, tit);
            return (pos >= 0) ? libros[pos].getPrecioFinal() : 0;
        }

       /* public String toString () {
            StringBuilder sb = new StringBuilder("[");
            for(int i = 0; i<libros.length -1; i++){
                sb.append(libros[i]);
                sb.append(",");
            }
            if(libros.length >0) {
                sb.append(libros[libros.length-1]);
            }
            sb.append("]");
            return sb.toString();

            //return Arrays.toString(Arrays.copy0f(libros,numLibros));
        }*/

        @Override
        public String toString(){
            StringJoiner sj = new StringJoiner(";","[","]");
            for (int i = 0; i< numLibros; i++){
                sj.add(libros[i].toString());
            }
            return sj.toString();
        }
    }




