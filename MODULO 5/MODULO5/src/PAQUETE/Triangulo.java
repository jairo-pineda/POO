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
public abstract class Triangulo extends Formas {
    
      private int base=10;
      private int altura=15;
      
     public Triangulo(){
        setDibujar("TRIANGULO");
        setCalcular("AREA= "+(base*altura)/2);
        setEstablecerColor("COLOR AMARILLO");
     }
     public String setInformacionFigura(){
         return"FIGURA 4";
     }
     
    }
    
                    


