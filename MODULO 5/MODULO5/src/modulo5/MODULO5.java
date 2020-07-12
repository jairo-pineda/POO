/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5;

import PAQUETE.Circulo;
import PAQUETE.Cuadrado;
import PAQUETE.Linea;
import PAQUETE.Triangulo;

/**
 *
 * @author JAIRO PINEDA
 */
public class MODULO5 {

    public static void main(String[] args) {
        
        //INSTANCIAMOS LAS CLASES
        Circulo circulo = new Circulo() {};
        Cuadrado cuadrado = new Cuadrado() {};
        Linea linea = new Linea() {};
        Triangulo triangulo = new Triangulo() {};
        
        //NSTRUCCION DE IMPRESION CIRCULO
        System.out.println(circulo.setInformacionFigura());
        circulo.imprimirFormas();
        circulo.imprimirCalcular();
        circulo.imprimirColor();
        System.out.println("");
        
        //NSTRUCCION DE IMPRESION  CUADRADO
        System.out.println(cuadrado.setInformacionFigura());
        cuadrado.imprimirFormas();
        cuadrado.imprimirCalcular();
        cuadrado.imprimirColor();
        System.out.println("");
        
        //NSTRUCCION DE IMPRESION LINEA 
        System.out.println(linea.setInformacionFigura());
        linea.imprimirFormas();
        linea.imprimirColor();
        System.out.println("");
        
       //NSTRUCCION DE IMPRESION TRIANGULO
        System.out.println(triangulo.setInformacionFigura());
        triangulo.imprimirFormas();
        triangulo.imprimirCalcular();
        triangulo.imprimirColor();
        
    }
    
}
