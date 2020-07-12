/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.pkg1;

/**
 *
 * @author JAIRO PINEDA
 */
public class MODULO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO#1
            System.out.println("EJERCICO#1");
            System.out.println("hola,soy Jairo Pineda");
            
//FIN EJERCICO#1

            System.out.println("");
            
//EJERCICIO#2   
      //declaracion de variables   
     double numero1=12;
     double numero2=5;
     double suma;
     double resta;
     double multiplicacion;
     double division=0;
     double mod; 
     //procedimiento
     suma=numero1+numero2;
     resta=numero1-numero2;
     multiplicacion=numero1*numero2;
     mod=numero1%numero2;
     //condicion 
     if (numero2 != 0){
                division = numero1 / numero2;
         }
     //resultado
     System.out.println("EJERCICO#2");
      System.out.println("La suma resulta:           " + suma);
      System.out.println("La resta resulta:          " + resta);
      System.out.println("La multiplicacion resulta: " + multiplicacion);
      System.out.println("La division resulta:       " + division);
      System.out.println("el mudulo resulta:         " + mod);
 //FIN EJERCICO#2
      
      System.out.println("");
 
 //EJERCICIO#3
        //DELCARACION  DE VARIABLE
        int M=6;
        int T=1;
        int K=-10;
        //EVALUACION Y RESULTADOS
        System.out.println("EJERCICO#3");
        if(M>T){
             System.out.println("VERDADERO");}
        else{
             System.out.println("FALSO");
        }
        if(T/K==-5){
             System.out.println("VERDADERO");}
        else{
             System.out.println("FALSO");
        }
        if(M+T==7  ||  M-T==5){
             System.out.println("VERDADERO");}
        else{
             System.out.println("FALSO");}
//FIN EJERCICIO#3

        System.out.println("");
     
//EJERCICIO#4
System.out.println("EJERCICIO 4");
//ARREGLO SIMPLE       
String[] nombre = new String[10];        
//DATOS
   nombre[0]="Pablo";
   nombre[1]="Pedro";
   nombre[2]="jairo";
   nombre[3]="hellen";
   nombre[4]="yubani";
   nombre[5]="saby";
   nombre[6]="diego";
   nombre[7]="Sebastian";
   nombre[8]="anthony";
   nombre[9]="martha";
   
   //IMPRECION
   System.out.println(nombre[0]);
   System.out.println(nombre[1]);
   System.out.println(nombre[2]);
   System.out.println(nombre[3]);
   System.out.println(nombre[4]);
   System.out.println(nombre[5]);
   System.out.println(nombre[6]);
   System.out.println(nombre[7]);
   System.out.println(nombre[8]);
   System.out.println(nombre[9]);
//FIN EJERCICIO#4
   
   System.out.println("");
     
//EJERCICIO#5
   System.out.println("EJERCICIO#5");
   //ARREGLO MULTIDIMENCIONAL
   String[] nombre1 = new String[5];
   String[] apellido=new String[5];
   String[] carrera=new String[5];
   String[] trabajo=new String[5];
   
   //DATOS
   nombre1[0]="Anthony";
   nombre1[1]="Jaqueline";
   nombre1[2]="jairo";
   nombre1[3]="hellen";
   nombre1[4]="yubani";
   apellido[0]="Mejia";
   apellido[1]="Mondragon";
   apellido[2]="Pineda";
   apellido[3]="Lopez";
   apellido[4]="Rodriguez";
   carrera[0]="Comercio";
   carrera[1]="Electronica";
   carrera[2]="Turismo";
   carrera[3]="Medicina";
   carrera[4]="Industrial";
   trabajo[0]="Diunsa";
   trabajo[1]="Jetstereo";
   trabajo[2]="Agencia de viajes";
   trabajo[3]="CEMESA";
   trabajo[4]="zip San Jose";
   
   //IMPRECION
   System.out.println("NOMBRE      APELLIDO      CARRERA      TRABAJO");
   System.out.println(nombre1[0]+("     ") +apellido[0]+("         ") +carrera[0]+("     ") +trabajo [0]);
   System.out.println(nombre1[1]+("   ") +apellido[1]+("     ") +carrera[1]+("  ") +trabajo [1]);
   System.out.println(nombre1[2]+("       ") +apellido[2]+("        ") +carrera[2]+("      ") +trabajo [2]);
   System.out.println(nombre1[3]+("      ") +apellido[3]+("         ") +carrera[3]+("     ") +trabajo [3]);
   System.out.println(nombre1[4]+("      ") +apellido[4]+("     ") +carrera[4]+("   ") +trabajo [4]);
//FIN EJERCICO#5 

System.out.println("");

//EJERCICIO#6
System.out.println("EJERCICO#6");
//arreglo
          String[] nombre2 = new String[3];
         int[] nota = new int[3];
         
         //datos         
         nombre2[0]="Jairo";
         nombre2[1]="Hellen";
         nombre2[2]="Diego";
         nota[0]=90;
         nota[1]=60;
         nota[2]=85;
         
         //evaluacion
         
         System.out.println("NOMBRE      NOTA     ESTADO" );
         if(nota[0]>=70){
             System.out.println(nombre2[0]+("       ")+nota[0]+("       ")+"APROBADO");}
         else{
              System.out.println(nombre2[0]+("       ")+nota[0]+("       ")+"REPROBADO");}
         if(nota[1]>=70){
             System.out.println(nombre2[1]+("      ")+nota[1]+("       ")+"APROBADO");}
         else{
              System.out.println(nombre2[1]+("      ")+nota[1]+("       ")+"REPROBADO");}
         if(nota[2]>=70){
             System.out.println(nombre2[2]+("       ")+nota[2]+("       ")+"APROBADO");}
         else{
              System.out.println(nombre2[2]+("       ")+nota[2]+("       ")+"REPROBADO");}
   //FIN EJERCICIO#6
System.out.println("");

//EJERCICIO#7
System.out.println("EJERCICO#7");
int numero3=2;
         
         while(numero3<102){
             System.out.println(numero3);
             numero3=numero3+2;
//FIN EJERCICIO#6
         }

    }
    
}
