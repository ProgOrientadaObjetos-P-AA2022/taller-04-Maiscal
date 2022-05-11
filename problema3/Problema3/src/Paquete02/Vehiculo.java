/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author maisc
 */
public class Vehiculo {
    private String cedula;
    private String marcaVeh;
    private int anioFab;
    private double valorVeh;
    private double valorMatric;
    
    public Vehiculo(){
        cedula = "1103052548";
        marcaVeh = "Toyota";
        anioFab = 2020;
        valorVeh = 25000;
    }
    public Vehiculo(String c, String m, int a, double valor){
        cedula = c;
        marcaVeh = m;
        anioFab = a;
        valorVeh = valor;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    public void establecerMarcaVeh(String m){
        marcaVeh = m;
    }
    public void establecerAnioFab(int a){
        anioFab = a;
    }
    public void establecerValorVeh(double v){
        valorVeh = v;
    }
 
    
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerMarcaVeh(){
        return marcaVeh;
    }
    public int obtenerAnioFab(){
        return anioFab;
    }
    public int valorA(){
        return anioFab =  2022 - anioFab ;
    }
    public double valorMactr(){
        return valorMatric = (((0.0002 * valorVeh) / 100) * valorA());
    }

    @Override
    public String toString() {
        
//        String mensaje = String.format(
//                "EL VEHICULO Y SU VALOR ES..."
//            + "\nCedula del due?o es s%\n"
//            + "La marca del vehiculo es  2%\n"
//            + "La matricula es anio del vehiculo es d%\n"
//            + "El valor de  la matricual es 2.f%\n"
//                ,obtenerCedula()
//                ,obtenerMarcaVeh()
//                ,obtenerAnioFab()
//                ,valorMactr()
//        );
        
        return "\nCedula: "+cedula+"\nMarca: "+marcaVeh+"\nAnio de matricula: "
                +anioFab+"\nValor del vehiculo es: "+valorVeh+"\nValor de la matricula es: "
                +valorMatric;
        
    }
    
    
    
}
