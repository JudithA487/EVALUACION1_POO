/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_colectores;

/**
 *
 * @author acost
 */
public class CuentaBancaria {
    private int noCuenta;
    private double saldo;
    private String cliente;
    
    
    public CuentaBancaria(){
        noCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 1000000;
    }
    
    public int getNoCuenta(){
        return noCuenta;
    }
    public void setNoCuenta(int cuenta){
        noCuenta = cuenta;
    }
     public String getCliente(){
        return cliente;
    }
    public void setCliente(String nomCliente){
        cliente = nomCliente;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double valor){
        saldo = valor;
                
                
    }
    
    public void retirar(double monto){
        if(saldo >= monto)
            saldo = saldo  - monto;
        else {
                System.out.println("Saldo insuficiente");
        }
   
    }
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + noCuenta);
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);
    }
    
}
