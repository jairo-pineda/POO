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
public class PilotoAviador {
    
    //PROPIEDADES
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String ruta;
    
    //CONSTRUCTOR
    public PilotoAviador(){
    }
    
    //METODOS PARA OBTENER INFORMACION(get)
    public String getNombre(){
            return nombre;
    }
    
    public String getApellido(){
            return apellido;
    }
    
    public int getEdad(){
            return edad;
    }
    
    public String getSexo(){
            return sexo;
    }
    public String getRuta(){
            return ruta;
    }
  
    //METODO PARA DAR INFORMACION (set)
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    
    public void setApellido(String _apellido){
        this.apellido= _apellido;
     }
    
     public void setEdad(int _edad){
        this.edad= _edad;
     }
     
      public void setSexo(String _sexo){
        this.sexo= _sexo;
      }
      
       public void setRuta(String _ruta){
        this.ruta= _ruta;
       }
       
}
     

    
    
       
            
    
