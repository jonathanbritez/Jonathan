/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional.condicionalesif;

public class CondicionalIf {
    
    public static void main(String args[]){
    //.................Primer condicional if ..........................
       
    //ingreso el tipo de variable ya definido con su valor
        int temperatura = 27;
        
        //realizo la condición 
        
        if (temperatura > 25){
            
            System.out.println("A la playa!!!");
        
        }
     //................Final del primer condicional if ................   
      
     
     //................Segundo condiccional if ........................
     
     //declaro la variable con su tipo de dato y lo defino en la misma linea
     
     boolean haceSol = true;
     
     // realizo la condicion 
     
     if(haceSol){
     
         System.out.println("No te olvide la sombrilla");
     }
     
     //................final del segundo condicional if ...............
     
     //................inicio del Tercer condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
     
     boolean HaceSol=true;
     boolean nevado = true;
     
     //realizo la condcion 
     
     if(HaceSol || nevado){
     
         System.out.println("Que bien!");
     }
    
     //................final del Tercer condicional if ...............
     
     //................inicio del Cuarto condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
     
     boolean Nevado = true;
     int Temperatura = 29;
     
     //realizo la condcion 
     
     if(Nevado && Temperatura >=20 && Temperatura <= 30){
     
         System.out.println("No me lo creo");
     }
    
     //................final del Cuarto condicional if ...............
     
     //................inicio del Quinto condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
    
     int temperaturA = 32;
     boolean haceSOl = true;
          
     //realizo la condcion 
     
     if(temperaturA < 0 || temperaturA > 30 && haceSOl){
     
         System.out.println("Mejor me quedo en casa");
     }
    
     //................final del Quinto condicional if ...............
    
     //................inicio del Sesto condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
    
     int TemperaturA = 32;
     
     //realizo la condcion 
     
     if(TemperaturA > 25){
     
         System.out.println("A la playa!!!");
     }
    
     //................final del Sesto condicional if ...............
     
     //................inicio del Septimo condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
    
     int TEmperaturA = 10;
     
     //realizo la condcion 
     
     if(TEmperaturA <= 25){
     
         System.out.println("Esperando al buen tiempo...");
     }
    
     //................final del Septimo condicional if ...............
     
    //................inicio del Octavo condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
    
     int TEMperaturA = 10;
     
     //realizo la condcion 
     
     if(TEMperaturA > 25){
     
         System.out.println("Esperando al buen tiempo ...");
     }else{
         
         System.out.println("A la playa !!!");
     
     }
    
     //................final del Octavo condicional if ...............
     
     //................inicio del Noveno condicional if ...............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
    
     int TEMPeraturA = 10;
     
     //realizo la condcion 
     
     if(TEMPeraturA > 25){
     
         if(TEMPeraturA >15){
                
             if(TEMPeraturA < 5 && nevado ){
                 
                 System.out.println("A dormir");
             
             }else{
             
                 System.out.println("A esquiar!!!");
             
             }
         }else{
             System.out.println("A la montaña !!");  
         }
     }else{
         
         System.out.println("A la playa !!!");
     
     }
    
     //................final del Noveno condicional if ...............
     
     //................inicio del decimo condicional if ..............
     
     //declaro la variable con su tipo de datos y lo asigno en la misma linea 
     
     int TEMPERATURA = 10;
     
     // inicio del condicional 
     
     if(TEMPERATURA < 15){
         
         if(TEMPERATURA > 25){
            
             System.out.println("A la montaña !!");
         
         }else{
         
             System.out.println("A la playa !!!");
         
         }
     
        
     }else if(TEMPERATURA < 5){
     
         System.out.println("A dormir...zzzz!");
     
     }else{
         System.out.println("A esquiar!!!");
     }
     
     //................final del decimo condicional if ...............
    }
 
}
