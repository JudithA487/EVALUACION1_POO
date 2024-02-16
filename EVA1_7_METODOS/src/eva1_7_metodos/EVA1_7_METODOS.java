/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author acost
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Judith");
        perso.setApellidos("Acosta Alvarez");
        perso.setEdad(19);
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nació en el año " + perso.calcularAnnioNac());
        //--------
        Persona[] grupo = new Persona [5];
        //HAY QUE CREAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++){
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //UNA VEZ CREADO EL OBJETO, HAY QUE LLENNARLO
            System.out.println("Introduce el nombre:");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido:");
            String ape = input.nextLine();
            grupo[i].setApellidos(ape);
            
            System.out.println("Introduce la edad:");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
        }
        //LEER
        for (int i = 0; i < grupo.length; i++){
             System.out.println("El nombre es " + grupo[i].generarNombreCom());
             System.out.println("Nació en el año " + grupo[i].calcularAnnioNac());
        }
    }
    
}
