/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete_1;

import paquete_2.B;
import paquete_2.C;

/**
 *
 * @author acost
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One obj1 = new One();
        System.out.println(obj1);
        
        //CLASE DEL PAQUETE 2
        B objB = new B();
        System.out.println(objB);
        
        //Two obj2 = new Two();--> NO SE PUEDE USAR
                            //--> porque no es accesible
                            // --> tiene modificador default
        C objC = new C();
        System.out.println(objC);
        
        //Three obj3 = new Three();
        
        
    }
    
}

class One{
    
}
