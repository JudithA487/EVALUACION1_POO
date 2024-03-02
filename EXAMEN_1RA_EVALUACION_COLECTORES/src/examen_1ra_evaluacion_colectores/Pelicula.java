/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_colectores;

/**
 *
 * @author acost
 */
public class Pelicula {
   private String Titulo;
   private String Estudio;
   private int Rating;
   
   public String getTitulo(){
       return Titulo;
   }
   
   public void setTitulo(String valor){
       Titulo = valor;
   }
   
   public String getEstudio(){
       return Estudio;
   }
   
   public void setEstudio(String valor){
       Estudio = valor;
   }
   
   public int getRating(){
       return Rating;
   }
   
   public void setRating(int valor){
       Rating = valor;
   }
   
   public void imprimirDatos(){
       System.out.println("Titulo:" + getTitulo());
       System.out.println("Estudio: " + getEstudio());
       System.out.println("Rating: " + getRating());
   }
   public void evaluarEdad(int edad) {
        if (edad >= Rating) {
            System.out.println("Puedes ver la película");
        } else {
            System.out.println("No puedes ver la película");
        }
    }

   
    
}
