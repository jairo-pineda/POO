/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.pkg3;

/**
 *
 * @author JAIRO PINEDA
 */
public class MODULO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("      CAPITAN");
        System.out.println("");
       
        //INSTANCIA DE CLACE
        PilotoAviador pilotoaviador =new PilotoAviador();
        
        pilotoaviador.setNombre("JAIRO");
        pilotoaviador.setApellido("PINEDA");
        pilotoaviador.setEdad(29);
        pilotoaviador.setSexo("MASCULINO");
        pilotoaviador.setRuta("SAP-MAD");
        
        //RESULTADO
        System.out.println("NOMBRE:    "+pilotoaviador.getNombre());
        System.out.println("APELLIDO:  "+pilotoaviador.getApellido());
        System.out.println("EDAD:      "+pilotoaviador.getEdad());
        System.out.println("SEXO:      "+pilotoaviador.getSexo());
        System.out.println("RUTA:      "+pilotoaviador.getRuta());
        
        
    }
    
}
