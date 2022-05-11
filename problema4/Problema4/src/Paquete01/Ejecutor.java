/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Cheque;

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
        
        Cheque obj1 = new Cheque ();
        Cheque obj2 = new Cheque ("Manuel","Banco de Loja", 15000);
        
        
        obj1.comision();
        obj2.comision();
        
        
        System.out.println(obj1);
        System.out.println(obj2); 
        
    }
}
