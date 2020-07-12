/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.pkg2;

/**
 *
 * @author JAIRO PINEDA
 */
public class Recursos {
    //ATRIBUTOS
    int nota=70;
    int numero1=10;
    int numero2=0;
    int lista=20;
    int division;
    
    //PRIMER METODO
    public void saludo() {
        System.out.println("PRIMER METODO");
    System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
    System.out.println("");
    }
    
    //SEGUNDO METODO
    public void calificacion(){
        System.out.println("SEGUNDO METODO");
        if(nota<70){
            System.out.println("EL ALUMNO ESTA REPROBADO");
        }
        else{
            System.out.println("EL ALUMNO ESTA APROBADO");
        }
        System.out.println("");
    }
    //TERCER METODO
    public void dividir(){
        System.out.println("TERCER METODO");
        if (numero2 != 0){
                division = numero1 / numero2;
                System.out.println("EL RESULTADO DE LA DIVICION ES  "+division);
         }
        else{
            System.out.println("EL DENOMINADOR DEBE SER SISTINTO DE CERO");
        }
        System.out.println("");
    }
   
    //CUARTO METODO
    public void lista(){
        System.out.println("CUARTO METODO");
        int lista=1;
       
         while(lista<10){
             System.out.println(lista);
             lista=lista+1; 
    }
        
        
        
        
    }
}
            
        
