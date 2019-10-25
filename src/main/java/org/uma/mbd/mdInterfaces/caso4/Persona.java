package org.uma.mbd.mdInterfaces.caso4;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private int edad;

	public Persona(String n, int e) {
		nombre = n;
		edad = e;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return nombre + ":" + edad;
	}


	@Override
	public boolean equals(Object o){
		boolean res = o instanceof Persona;
		Persona p = res ?(Persona) o :null;
		return res &&(p.nombre.equalsIgnoreCase(nombre));
	}

	@Override
	public int hashCode(){
		return nombre.toLowerCase().hashCode();
	}



	@Override
	public int compareTo(Persona per) {
		int res = Integer.compare(edad, per.edad);
		if (res == 0) {
			res = nombre.compareTo(per.nombre);
		}
		return res;
	}
}












