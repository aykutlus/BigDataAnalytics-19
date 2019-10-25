package org.uma.mbd.mdHospitalV1L.mdhospitalv1l;

public class Paciente extends Persona {

    private double peso;
    private double indiceMasaCorporal;
    private double altura;
    private String numSegSocial;
    private boolean urgencia;
    private Doctor medico;


    public Paciente(String nombre, String apellidos, String dni, int edad, Genero sexo, double peso,double altura,String numSegSocial,boolean esurgencia) {
        super(nombre, apellidos, dni, edad, sexo);
        this.peso=peso;
        this.altura=altura;
        this.numSegSocial=numSegSocial;
        this.urgencia=esurgencia;
        medico=null;
        if (altura<0){
            throw new RuntimeException("altura no valida");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <=0){
            throw new RuntimeException("peso no valida");
        }
        this.peso = peso;
    }

    public double getIndiceMasaCorporal() {
        return Math.rint(peso/altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura<=0){
            throw new RuntimeException("altura no valida");
        }
        this.altura = altura;
    }

    public String getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    public boolean isurgencia() {
        return urgencia;
    }

    public void seturgencia(boolean esurgencia) {
        this.urgencia = esurgencia;
    }

    private boolean esUrgencia(){
        return this.urgencia;
    }

    public Doctor atendidoPor(){
        if (medico == null){
            return null;
        }else{
            return this.medico;
        }
    }
    public void asignaMedico(Doctor d){
         this.medico = d;
    }



}
