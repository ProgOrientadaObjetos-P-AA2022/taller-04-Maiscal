/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author maisc
 */
public class Estudiante {
    private String nombre;
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;
    
    public Estudiante (){
        nombre = "Pendejo";
        cal1 = 20;
        cal2 = 15;
        cal3 = 5;
    }
    public Estudiante(String a, double uno, double dos, double tres){
        nombre = a;
        cal1 = uno;
        cal2 = dos;
        cal3 = tres;
    }
    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerCal1(double c){
        cal1 = c;
    }
    public void establecerCal2(double c){
        cal2 = c;
    }
    public void establecerCal3(double c){
        cal3 = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public double obtenercal1(){
        return cal1;
    }
    public double obtenercal2(){
        return cal2;
    }
    public double obtenercal3(){
        return cal3;
    }
    public double promedio(){
        return promedio = (cal1 + cal2 + cal3) / 3;
    }

    @Override
    public String toString() {
//        String mensaje = String.format("LOS DATOS SE DEL ESTUDIANTE SON"
//                + "\nNombre del estudiante: 2%\n"
//                + "Calificacion 1: 2.f%\n"
//                + "Calificacion 1: 2.f%\n"
//                + "Calificacion 1: 2.f%\n"
//                + "Promedio general del estudiante s% es 2.f%\n"
//                ,obtenerNombre()
//                ,obtenercal1()
//                ,obtenercal2()
//                ,obtenercal3()
//                ,obtenerNombre()
//                ,obtenerPromedio()
//        );
        
        return "\nNombre: "+nombre+"\nCalificacion 1: "+cal1+"\nCalifiacion 2:"
                +cal2+"\nCalificacion 3:"+cal3+"\nTotal de notas: "+promedio
                ;
    }
}
