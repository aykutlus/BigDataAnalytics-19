package org.uma.mbd.mdTestL.testl;

import java.util.Objects;

public class Test {

    private int aciertos;
    private int errores;
    private String alumno;

    public Test( String alumno,int aciertos, int errores) {
        this.aciertos = aciertos;
        this.errores = errores;
        this.alumno = alumno;
    }

    public int getAciertos() {
        return aciertos;
    }

    public int getErrores() {
        return errores;
    }

    public String getAlumno() {
        return alumno;
    }

   /* public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return alumno.equals(test.alumno);
    }*/

    @Override
    public boolean equals(Object obj){
        boolean res = obj instanceof Test;
        Test t  = res?(Test)obj: null;
        return res && alumno.equalsIgnoreCase(t.alumno);
    }

    @Override
    public int hashCode() {
        return alumno.toLowerCase().hashCode();
    }

    public double calificacion(double valAc, double valErr){
        if (valAc <= 0 ){
            throw new RuntimeException("Wrong value(p)" + valAc);
        }
        if (valErr > 0 ){
            throw new RuntimeException("wrong value(n)" + valErr);
        }
        return aciertos*valAc + errores*valErr;
    }

    @Override
    public String toString() {
        return  alumno.toUpperCase() + " " + "[" + aciertos + "," + errores +"]";
    }
}
