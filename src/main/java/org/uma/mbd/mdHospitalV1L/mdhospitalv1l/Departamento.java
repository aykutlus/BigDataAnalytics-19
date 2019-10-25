package org.uma.mbd.mdHospitalV1L.mdhospitalv1l;

import java.util.List;

public class Departamento {

    private int numMedicos;
    private String nombre;
    List<Doctor> medicos;

    public Departamento(String nombre, List<Doctor> medicos) {
        this.nombre = nombre;
        this.medicos = medicos;
    }

    public Doctor getDoctor(String dni){
        int i = 0;
        while (i<medicos.size() && !dni.equalsIgnoreCase(medicos.get(i).getDni())){
            i++;
        }
        return medicos.get(i);
    }
    public boolean trabajaEnDepartamento(Doctor doc){
        return medicos.contains(doc);
    }
    public int numMedicos(Categoria cat){
        return medicos.size();
    }
    public int getNumMedicos(){
        return medicos.size();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Departamento(" + nombre + "; " + medicos + ")";
    }


}

