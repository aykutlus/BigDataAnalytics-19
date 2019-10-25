package org.uma.mbd.mdTestL.testl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAsignatura {

    private String nombre;
    private double valorAciertos;
    private double valorErrores;
    private List<Test> examenes;
    private final static int APROBADO=5;

    public TestAsignatura(String nombre, double valorAciertos, double valorErrores, List<String> alumnos) {
        this.nombre = nombre;
        this.valorAciertos = valorAciertos;
        this.valorErrores = valorErrores;
        examenes = new ArrayList<>();
        extraeDatos(alumnos);
    }
    public TestAsignatura(String n, List<String> e) {
        this(n,1,0,e);

    }


    private void extraeDatos(List<String> alumnos){
        for(String datoAlumno:alumnos){
            try (Scanner sc= new Scanner(datoAlumno)){
                sc.useDelimiter("[:+]");
                String nA = sc.next();
                int numA=sc.nextInt();
                int numF=sc.nextInt();
                Test test = new Test(nA,numA,numF);
                examenes.add(test);
            }

            /*
            String [] campos = datoAlumno.split("[:+]");
            String nA = campos[0];
            int numA = Integer.parseInt(campos[1]);
            int numF = Integer.parseInt(campos[2]);
            */


        }
    }

    public double notaMedia(){
        double sum=0;
        for (Test test : examenes) {
            sum += test.calificacion(valorAciertos,valorErrores);
        }
        return sum/examenes.size();
    }

    public int aprobados(){
        int nA=0;
        for(Test test:examenes){
            if ( test.calificacion(valorAciertos,valorErrores)>= APROBADO){
                nA++;
            }
        }
        return nA;
    }
    public String getNombre(){
        return nombre;
    }


}
