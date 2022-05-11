/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author maisc
 */
public class Cheque {
    private String nombre;
    private String nomBanco;
    private double valorCheque;
    private double comision;
    
    public Cheque(){
        nombre = "Juanito";
        nomBanco = "Banco de Guayaquil";
        valorCheque = 90000;
    }
    public Cheque(String n, String nb, int v){
        nombre = n;
        nomBanco = nb;
        valorCheque = v;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerNomBanco(String nb){
        nomBanco = nb;
    }
    public void establecerValorCheque(double c){
        valorCheque = c;
    }
    
    public double comision(){
        return comision = valorCheque * 0.003;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerNomBanco(){
        return nomBanco;
    }
    public double obtenerValorCheque(){
        return valorCheque;
    }

    @Override
    public String toString() {
        
//       String mensaje = String.format(
//                "EL VEHICULO Y SU VALOR ES..."
//            + "\nCedula del due?o es s%\n"
//            + "El nombre del banco es  s%\n"
//            + "El valor del cheque es d%\n"
//            + "El valor de  la comision del banco es 2.f%\n"
//                ,obtenerNombre()
//                ,obtenerNomBanco()
//                ,obtenerValorCheque()
//                ,comision()
//        );
        
        
        return
                "\nNombre del cliente es: "+nombre+"\nNombre del banco es: "
                +nomBanco+"\nValor del cheque es: "+valorCheque+"\nLa comision "
                + "del banco es: "+comision
                ;
    }
    
    
}
