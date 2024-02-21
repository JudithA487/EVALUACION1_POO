/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_tv;

/**
 *
 * @author acost
 */
public class Televisión {
    //ATRIBUTOS
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    //CONSTRUCTORES:
    //CONSTRUCTOR SIN ARGUMENTOS SE CONOCE COMO CONSTRUCTOR DEFAULT
    //Método para inicializar los objetos
    public Televisión(){
           volumen = 30;
           canal = 5;
           estaEncendida = false;
    }
    
    //
    public void subirVolumen(){
        if(estaEncendida && (volumen < 100))
        volumen = volumen + 1;
        //volumen+=1;
        //volumen++;
    } 
    public void bajarVolumen(){
        if(estaEncendida && (volumen > 0))
        volumen = volumen - 1;
    }
    
    public void subirCanal(){
        if(estaEncendida && (canal > 100))
        canal = canal + 1;
        //volumen+=1;
        //volumen++;
    } 
    public void bajarCanal(){
        if(estaEncendida && (canal > 0))
        canal = canal - 1;
    }
    public void cambiarCanal(int noCanal){
                   // ! ----> negación
        if(estaEncendida && !(noCanal < 0))
        canal = noCanal;
    }
    public void power(){
        if(estaEncendida == true)
            estaEncendida = false;
        else
            estaEncendida = true;
        
    }
    public void imprimirConfi(){
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + estaEncendida);
    }
}
