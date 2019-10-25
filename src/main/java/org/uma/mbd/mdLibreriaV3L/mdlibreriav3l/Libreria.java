package org.uma.mbd.mdLibreriaV3L.mdlibreriav3l;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    // private List<Libro> libros = new LinkedList<>();

    public void addLibro(String aut, String tit, double pb) {
        Libro libro = new Libro(aut, tit, pb);
        addLibro(libro);
    }

    protected void addLibro(Libro libro) {
        int i = posicionLibro(libro.getAutor(),libro.getTitulo() );
        if (i < 0) {
            libros.add(libro);
        } else {
            libros.set(i,libro);
        }
    }

    private int posicionLibro (String aut, String tit){
        int pos = 0;
        while (pos < libros.size() &&
                !(aut.equalsIgnoreCase(libros.get(pos).getAutor()) &&
                        tit.equalsIgnoreCase(libros.get(pos).getTitulo()))) {
            pos++;
        }
        return (pos == libros.size()) ? -1 : pos;  //doğru olduğunda -1 sonuç olmadığında pos sonuç
    }


    public void remLibros (String aut, String tit){
        int pos = posicionLibro(aut, tit);
        if (pos >= 0) {
            libros.remove((pos));

        }
    }

    public double getPrecioBase (String aut, String tit){
        int pos = posicionLibro(aut, tit);
        return (pos >= 0) ? libros.get(pos).getPrecioBase() : 0;
    }

    public double getPrecioFinal (String aut, String tit){
        int pos = posicionLibro(aut, tit);
        return (pos >= 0) ? libros.get(pos).getPrecioFinal() : 0;
    }
    @Override
    public String toString () {
        return libros.toString();

    }

    //return Arrays.toString(Arrays.copy0f(libros,numLibros));
}


