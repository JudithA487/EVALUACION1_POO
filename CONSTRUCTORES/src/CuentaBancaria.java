/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acost
 */
public class CuentaBancaria {
    private int noCuenta;
    private double saldo;
    private String cliente;
    
    //CONSTRUCTOR DEFAULT (SIN ARGUMENTOS)
    public CuentaBancaria(){
        noCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 1000000;
    }
    
    //get y set
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
    
    public void retirar(double monto){
        if(saldo >= monto)//hay que tener dinero
            saldo = saldo  - monto;
    }
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
}
