/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author maisc
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private String dni;
    private double sueldoB;
    private double sueldoTotal;
    
    public Profesor(){    
        nombre = "Manuel";
        apellido = "Cabrera";
        dni = "1546321654321654";
        sueldoB = 5000;
    }
    public Profesor(String c, String ape, String d, double s){    
        nombre = c;
        apellido = ape;
        dni = d;
        sueldoB = s;
    }
    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerApellido(String c){
        apellido = c;
    }
    public void establecerDni(String c){
        dni = c;
    }
    public void establecerSueldoB(double c){
        sueldoB = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerDni(){
        return dni;
    }
    public double obtenerSueldoB(){
        return sueldoB;
    }
    public double sueldoTotal(){
        return sueldoTotal = (((sueldoB * 20) / 100) + sueldoB );
    }

    @Override
    public String toString() {
//        String mensaje = String.format(
//                "EL SUELDO Y DATOS DE UN PROFESOR ES..."
//            + "\nNombre del docente es s%\n"
//            + "El apellido del docente es 2%\n"
//            + "La cedula del docente es 2%\n"
//            + "El sueldo basico es 2.f%\n"
//            + "El total del sueldo es de : 2.f%\n"
//                ,obtenerNombre()
//                ,obtenerApellido()
//                ,obtenerDni()
//                ,obtenerSueldoB(),
//                obtenerSueldoTotal()
//        );
        return "\nNombre: "+nombre+"\nApellido: "+apellido+"\nCedula: "+dni+
                "\nSueldo: "+sueldoB+"\nSueldo Total: "+sueldoTotal  
                ;
        
                
    }

 
    
}
