/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;
import java.util.Scanner;

public class variable {
    
    public static void main(String args[]) {
        // variables
        
        int numero1;
        int numero2;
        int suma;
        int edad;
        String nombre;
        
        //constante
        
        final int numero_3 = 4;
        
        //ingreso los valores a la variable numero1 y numero2
        
        numero1 = 30;
        numero2 = 40;
        
        //operacion suma
        
        suma = numero1 + numero2;
        
        //muestro en pantalla las dos variables y el resultado de la suma
        
        System.out.println("Numero 1" + numero1);
        System.out.println("Numero 2" + numero2);
        System.out.println("Resultado de la suma entre Numero 1 + numero 2 = " + suma);
        
        //cambio de valores de numero1 y numero2 y vuelvo a realizar la operacion 
        
        numero1 = 100;
        numero2 = 200;
        
        //operacion de suma 
        
        suma = numero1 + numero2;
        
        //muestro en pantalla las dos variables y el resultado de la suma
        
        System.out.println("Numero 1" + numero1);
        System.out.println("Numero 2" + numero2);
        System.out.println("Resultado de la suma entre Numero 1 + numero 2 = " + suma);
        
        //instacio y muestro en pantalla la variable nombre y su edad 
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Escribe tu edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Tu nombre es: " + nombre + " " + " y tenes: " + edad + " años");
        
       //muestro en pantalla la constante
       
       System.out.println("Constante " + numero_3);
        
        
    }
}
