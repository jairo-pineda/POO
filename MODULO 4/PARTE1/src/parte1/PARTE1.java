/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte1;

import PAQUETE.Ciudadano;

/**
 *
 * @author JAIRO PINEDA
 */
public class PARTE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //INSTANCIA LA CLASE 
        Ciudadano ciudadano=new Ciudadano();
        
        //VALORES DE VARIABLES
        ciudadano.setNombre("Jairo Pineda");
        ciudadano.setEdad(29);
        ciudadano.setExperiencia("2 AÑOS DE EXPERIENCIA");
        
        //INSTRUCCION DE IMPRESION        
        System.out.println(ciudadano.getNombre());
        System.out.println(ciudadano.getEdad());
        System.out.println(ciudadano.getExperiencia());
        
//FIN PARTE 1 
    }
    
}
