/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE;

/**
 *
 * @author JAIRO PINEDA
 */
public abstract class Circulo extends Formas {
    
     private double circunferencia=10;
    
    public Circulo(){ 
        setDibujar("CIRCULO");
        setCalcular("RADIO=  "+circunferencia/2.39); 
        setEstablecerColor("COLOR AZUL");
    }
     public String setInformacionFigura(){
         return"FIGURA 1";
     }
        
}

    
        
 

