/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import PAQUETE.CostaRica;
import PAQUETE.ElSalvador;
import PAQUETE.Honduras;

/**
 *
 * @author JAIRO PINEDA
 */
public class PARTE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancia de clases
        Honduras hn = new Honduras();
        ElSalvador sv = new ElSalvador();
        CostaRica cr = new CostaRica();
        
        //IMPRESION
        System.out.println(hn.getPais());
        System.out.println(hn.getPresidente());
        System.out.println(sv.getPais());
        System.out.println(sv.getPresidente());
        System.out.println(cr.getPais());
        System.out.println(cr.getPresidente());
        
        
    }
    
}
