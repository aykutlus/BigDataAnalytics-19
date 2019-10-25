package org.uma.mbd.mdAltura.altura;

public class Pais implements Comparable<Pais>{

    private String nombre;
    private String contiene;
    private double altura;

    public Pais(String nombre, String contiene, double altura) {
        this.nombre = nombre;
        this.contiene = contiene;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContiene() {
        return contiene;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o){
        boolean res = o instanceof Pais;
        Pais p = res ?(Pais)o :null;
        return res &&(p.nombre.equalsIgnoreCase(nombre));
    }

    @Override
    public int hashCode(){
        return nombre.toLowerCase().hashCode();
    }
    @Override
    public String toString(){
        return "Pais(" + nombre +"," + contiene + "," + altura  + ")";
    }

    @Override
    public int compareTo(Pais pais){
        int res = contiene.compareTo(pais.contiene);
        if (res==0){
            res = nombre.compareTo(pais.nombre);
        }
        return res;

    }
}
