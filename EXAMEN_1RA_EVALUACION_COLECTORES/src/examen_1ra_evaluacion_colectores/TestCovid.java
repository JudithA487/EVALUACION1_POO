/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_colectores;

/**
 *
 * @author acost
 */
public class TestCovid {
    private int edad;
    private boolean TieneEnfermedadCronica;
    private double peso;
    private double estatura;
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad = valor;
    }
    
    public boolean getTieneEnfermedadCronica(){
        return TieneEnfermedadCronica;
    }
    
    public void setTieneEnfermedadCronica(boolean valor){
        TieneEnfermedadCronica = valor;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double valor){
        peso = valor;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public void setEstatura(double valor){
        estatura = valor;
    }
    
     private double calcularIMC() {
        return peso / (estatura * estatura);
    }
    
     public String calcularPersonaRiesgo() {
        if (edad >= 65 || TieneEnfermedadCronica || calcularIMC() > 30) {
            return "PERSONA DE RIESGO";
        } else {
            return "PERSONA SIN RIESGO";
        }
    }
            
}
