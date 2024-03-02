/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_colectores;

/**
 *
 * @author acost
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String direccion;
    private int yearIngreso;
    private double salario;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String valor){
        apellido = valor;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String valor){
        direccion = valor;
    }
    
    public int getYearIngreso(){
        return yearIngreso;
    }
    
    public void setYearIngreso(int valor){
        yearIngreso = valor;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double valor){
        salario = valor;
    }
    
    public int calcularVacaciones() {
        int antiguedad = 2024 - yearIngreso; 
        int diasVacaciones = 6; 
        diasVacaciones += antiguedad * 2;
        diasVacaciones += (antiguedad / 5) * 2;
        return diasVacaciones;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Año de ingreso: " + yearIngreso);
        System.out.println("Salario: " + salario);
        System.out.println("Días de vacaciones: " + calcularVacaciones());
    }
    
}
