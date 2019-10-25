package org.uma.mbd.mdHospitalV2L.hospitalv2l;

import org.uma.mbd.mdHospitalV1L.mdhospitalv1l.Departamento;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private int numDepartamentos;
    private String nombre;
    private String direccion;
    List<Departamento> departamentos;
    List<Planta> plantas = new ArrayList<>();
    List<String> nombresDepartamentos;

    public Hospital(String nombre, String direccion, List<Departamento> departamentos, int nplantas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamentos = departamentos;
        numDepartamentos=departamentos.size();
        for (int i = 0; i < nplantas; i++){
            plantas.add(new Planta(8, "P"+i));
        }
        nombresDepartamentos = new ArrayList<>();
        for (int i = 0; i < numDepartamentos; i++) {
            nombresDepartamentos.add(departamentos.get(i).getNombre());
        }
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

    public int numPlantas(){
        return plantas.size();
    }
    public Planta getPlanta(int i ){
        if(i >= plantas.size()){
            throw new IndexOutOfBoundsException("Planta " + i + " no encontrada");
        }
        return plantas.get(i);
    }

    public List<String> getNombresDepartamentos() {
        return nombresDepartamentos;
    }

    @Override
    public String toString() {
        return "Hospital(" + departamentos + " " + numPlantas() + " plantas]" ;
    }
}
