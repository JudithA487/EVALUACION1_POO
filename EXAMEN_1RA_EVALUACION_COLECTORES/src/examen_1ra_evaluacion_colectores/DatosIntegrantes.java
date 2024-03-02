/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_colectores;

/**
 *
 * @author acost
 */
public class DatosIntegrantes {
    private String nombre;
    private String apellidos;
    private int numeroControl;
    private String nombreEquipo;
    private static String carrera;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String valor){
        apellidos = valor;
    }
    
    public int getNumeroControl(){
        return numeroControl;
    }
    
    public void setNumeroControl(int valor){
        numeroControl = valor;
    }
    
    public String getNombreEquipo(){
        return nombreEquipo;
    }
    
    public void setNombreEquipo(String valor){
        nombreEquipo = valor;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public void setCarrera(String valor){
        carrera = valor;
    }
    
    public String generarNombreCom(){
        return nombre + " " + apellidos;
    }
    
    public void imprimirDatosEquipo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Numero de control: " + getNumeroControl());
        System.out.println("Nombre del equipo: " + getNombreEquipo());
        System.out.println("carrera: " + getCarrera());

    }

}
