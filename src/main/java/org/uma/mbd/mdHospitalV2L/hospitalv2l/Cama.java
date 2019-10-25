package org.uma.mbd.mdHospitalV2L.hospitalv2l;

public class Cama {

    private String codigo;
    private Paciente paciente;

    public Cama(String cod){
        codigo = cod;
        paciente = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public boolean estaLibre(){
        return paciente == null;
    }


    @Override
    public String toString(){
        String sal = "Cama: " + getCodigo();
        if(estaLibre()){
            sal += " Libre";
        } else {
            sal += "Ocupada por " + paciente;
        }
        return sal;
    }
}
