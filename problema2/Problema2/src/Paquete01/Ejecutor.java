/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Profesor;

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
        
        Profesor obj1 = new Profesor ();
        Profesor obj2 = new Profesor ("Pato","Garcia","09445548410", 1005);
        
        obj1.sueldoTotal();
        obj2.sueldoTotal();
        
        System.out.println(obj1);
        System.out.println(obj2); 
    }
    
}
