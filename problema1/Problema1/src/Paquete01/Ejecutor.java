/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Estudiante;

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
        
        Estudiante obj1 = new Estudiante();
        Estudiante obj2 = new Estudiante("Luis", 15, 5.5, 25);
            
        obj1.promedio();
        obj2.promedio();
        
        System.out.println(obj1);
        System.out.println(obj2);
        
    }
    
}
