/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores;

/**
 *
 * @author acost
 */
public class CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Cliente: " + cuenta.getCliente);
        System.out.println("Cuenta: " + cuenta.getNocuenta);
        System.out.println("Saldo: " + cuenta.getSaldo);
    }

    
    
}
