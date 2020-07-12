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
public abstract class Linea extends Formas{
        
     public Linea(){
        setDibujar("LINEA");
        setEstablecerColor("COLOR NEGRA");
        
    }
      public String setInformacionFigura(){
         return"FIGURA 3";
      }
}
