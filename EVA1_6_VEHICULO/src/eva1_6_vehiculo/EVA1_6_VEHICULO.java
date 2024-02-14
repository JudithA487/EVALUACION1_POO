/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import eva1_6_vehiculos.Vehiculo;

/**
 *
 * @author acost
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo miCarrito = new Vehiculo();
        miCarrito.setMarca("Ford");
        miCarrito.setModelo("F150");
        miCarrito.setAnnio(2024);
        miCarrito.setValor(5000000);
        miCarrito.setColor("Rojo");
        
        System.out.println("Marca: " + miCarrito.getMarca());
        System.out.println("Modelo: " + miCarrito.getModelo());
        System.out.println("Año: " + miCarrito.getAnnio());
        System.out.println("Color: " + miCarrito.getColor());
        System.out.println("Valor: " + miCarrito.getValor());
    }
    
}
