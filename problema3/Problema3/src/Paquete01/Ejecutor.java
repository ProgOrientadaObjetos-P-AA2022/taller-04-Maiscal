/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Vehiculo;

/**
 *
 * @author maisc
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo obj1 = new Vehiculo ();
        Vehiculo obj2 = new Vehiculo ("110254828","ZUZUKY",2019, 15000);
        
        
        obj1.valorA();
        obj1.valorMactr();
        obj2.valorA();
        obj2.valorMactr();
        
        System.out.println(obj1);
        System.out.println(obj2); 
        
    }
    
}
