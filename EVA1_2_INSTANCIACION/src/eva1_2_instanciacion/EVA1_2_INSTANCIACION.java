/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_instanciacion;

/**
 *
 * @author acost
 */
public class EVA1_2_INSTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        //instanciacion: crear el objeto --> darle memoria
        //clase identificador = new constructor()
        //constructor --> Método con el mismo nombre que la clase.
        Persona perso1 = new Persona();
        System.out.println(perso1);
        //perso1 --> referencia --> dirección de memoria
        Vehiculo auto = new Vehiculo();
        System.out.println(auto);
        auto.marca = "Ford";
        auto.modelo = "Mustang";
        auto.annio = 1965;
        System.out.println("Marca " + auto.marca);
        System.out.println("Modelo " + auto.modelo);
        System.out.println("Año " + auto.annio);
    }
    
}
//tipo de dato abstracto
class Persona{
    
}

class Vehiculo{
    //ATRIBUTOS
    String marca;
    int annio;
    String modelo;
    
    


}