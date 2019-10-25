package org.uma.mbd.mdHospitalV1L.mdhospitalv1l;

import java.util.List;

public class Hospital {

    private int numDepartamentos;
    private String nombre;
    private String direccion;
    List<Departamento> departamentos;

    public Hospital(String nombre, String direccion, List<Departamento> departamentos,int numDepartamentos) {
        this.numDepartamentos = numDepartamentos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamentos = departamentos;
    }

    public Departamento getDepartamento(String dep){
        int i = 0;
        while (i<departamentos.size() && !dep.equalsIgnoreCase(departamentos.get(i).getNombre())){
            i++;
        }
        return departamentos.get(i);
    }
    public int getNumDepartamentos() {
        return numDepartamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Hospital(" + departamentos + ')';
    }
}
