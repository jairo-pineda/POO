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
public class Ciudadano {
    
    //MODIFICADORES DE ACCESO
    private String nombre;
    private int edad;
    private String experiencia;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
   
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
     public void setExperiencia(String experiencia){
        this.experiencia=experiencia;
    }
    public String getExperiencia(){
        return experiencia;
    }
    
}
