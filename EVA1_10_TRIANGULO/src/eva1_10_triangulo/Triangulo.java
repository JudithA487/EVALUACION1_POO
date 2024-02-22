/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_triangulo;

/**
 *
 * @author acost
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        base = -1;
        altura = -1;
    }
    
     public double getBase(){
         return base;
     } 
     
     public void setBase(double valor){
         base = valor;
     }
     
     public double getAltura(){
         return altura;
     }
     
     public void setAltura(double valor){
         altura = valor;
     }
     
     
     private double calcularArea(){
         return (base * altura) / 2;
     }
     
     private double calcularPeri(){
         double peri;
         //suma de los tres lados, falta el lado mayor hipotenusa
         return (base + altura + (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))));
         
         
         
     }
     
     public void imprimirDatos(){
         System.out.println("Base: " + getBase());
         System.out.println("Altura: " + getAltura());
         System.out.println("El área del triangulo es: " + calcularArea());
         System.out.println("El perimetro del triangulo es: " + calcularPeri());
     }
   
}
