/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer8_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
       int longitud;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        longitud=frase.length();
        if(8==longitud){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
    
}
