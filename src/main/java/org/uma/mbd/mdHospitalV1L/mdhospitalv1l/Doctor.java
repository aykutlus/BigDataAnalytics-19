package org.uma.mbd.mdHospitalV1L.mdhospitalv1l;

import java.util.Objects;

public class Doctor extends Persona {

    private double horasSemanales;
    private Categoria categoriaPersonal;
    private boolean trabajaEnPrivado;


    public Doctor(String nombre, String apellidos, String dni, int edad, Genero sexo,Categoria cat,boolean tp,double hs) {
        super(nombre, apellidos, dni, edad, sexo);
        this.categoriaPersonal=cat;
        this.horasSemanales=hs;
        this.trabajaEnPrivado=tp;
    }

    public boolean isTrabajaEnPrivado(){
        return this.trabajaEnPrivado;
    }

    public Categoria getCategoriaPersonal() {
        return categoriaPersonal;
    }

    public void setCategoriaPersonal(Categoria categoriaPersonal) {
        this.categoriaPersonal = categoriaPersonal;
    }


    public double getHorasSemanales() {
        return horasSemanales;
    }
}
