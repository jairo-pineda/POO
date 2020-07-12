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
public abstract class Formas {
    
    //ATRIBUTOS
    private String dibujar;
    private String establecercolor;
    private String calcular;
    
    //METODOS    
    public void setDibujar(String dibujar){
        this.dibujar=dibujar;
    }
    public String getDibujar(){
        return this.dibujar;
    }        
           
     public void setEstablecerColor(String establecercolor){
        this.establecercolor=establecercolor;
    }     
    public String getEstablecerColor(){
        return this.establecercolor;
    }   
    
    public void setCalcular(String calcular){
        this.calcular=calcular;
    }
    public String getCalcular(){
        return this.calcular;    
    }
    
    public void imprimirFormas(){
        System.out.println(dibujar);
    }
    public void imprimirCalcular(){
        System.out.println(calcular);
    }
    public void imprimirColor(){
        System.out.println(establecercolor);
    }
    abstract String setInformacionFigura();
}
