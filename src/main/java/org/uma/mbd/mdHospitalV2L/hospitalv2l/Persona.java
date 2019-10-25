package org.uma.mbd.mdHospitalV2L.hospitalv2l;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private Genero sexo;

    public Persona(String nombre, String apellidos, String dni, int edad, Genero sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }


}
