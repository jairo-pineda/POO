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
public abstract class Cuadrado extends Formas {
    
    
     private int lado=10;
      
     public Cuadrado(){
        setDibujar("CUADRADO");
        setCalcular("AREA= "+lado*lado);
        setEstablecerColor("COLOR VERDE");
     }
      public String setInformacionFigura(){
         return"FIGURA 2";
      }
    } 
    

