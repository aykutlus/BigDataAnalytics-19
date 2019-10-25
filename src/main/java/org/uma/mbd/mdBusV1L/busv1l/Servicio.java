package org.uma.mbd.mdBusV1L.busv1l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Servicio {

    private String ciudad;
    private List<Bus> buses;

    public Servicio(String ciudad) {
        this.ciudad = ciudad;
        buses = new LinkedList<Bus>(); // almanecer şu an bununla depoluyorum  //linkedlist==arraylist ikisi de koyulabilir
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void leeBuses(String file) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new File(file))){
            leeBuses(sc);
            /*while(sc.hasNextLine()){
                System.out.println(sc.nextLine());*/
            }
        }

//scannerin biri oluşturmak için diğeri bölmek için aşağıdaki gibi

    private void leeBuses(Scanner sc) throws FileNotFoundException {
        while (sc.hasNextLine()) {
            String datosBus = sc.nextLine();
            stringToBus(datosBus);   //
        }

    }
    private void stringToBus(String datos){
        try (Scanner sc=new Scanner(datos)){
            sc.useDelimiter(",");
            int codB =sc.nextInt();
            String mat = sc.next();
            int codL= sc.nextInt();
            Bus bus = new Bus(codB,mat);
            bus.setCodLinea(codL);
            buses.add(bus);
        }catch (InputMismatchException e){
            System.err.println("datos incorrectos" + datos);
        }catch (NoSuchElementException e){
            System.err.println("faltan datos en" + datos);
        }
        /*String fichero = "src/main/java/org/uma/mbd/mdEjemplo/buses.txt";

        try (Scanner sca = new Scanner(fichero)){
            sca.useDelimiter("[,]");*/ //yanlış olan


        }
    public List<Bus> filtra(Criterio criterio){
        List<Bus> lista = new ArrayList<>();
        for (Bus bus: buses){
            if (criterio.esSeleccionable(bus)){
                lista.add(bus);
            }
        }
        return lista;
    }
    public void guarda(String file,Criterio criterio) throws FileNotFoundException{
        try (PrintWriter pw = new PrintWriter(file)){
            guarda(pw,criterio);
        }
    }
    public void guarda(PrintWriter pw,Criterio criterio){
        List<Bus> lista = filtra(criterio);
        for(Bus bus:lista){
            pw.println(bus);
        }
    }

}





