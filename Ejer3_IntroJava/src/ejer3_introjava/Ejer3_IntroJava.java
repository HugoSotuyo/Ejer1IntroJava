/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_introjava;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer3_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese una Frase ");
        String frase = leer.nextLine();
        System.out.println(" LA FRASE EN MAYUSCULAS ES: ");
        System.out.println(frase.toUpperCase(Locale.ITALY));
        System.out.println(" la frase en minuscula es: ");
        System.out.println(frase.toLowerCase(Locale.ITALY));
        // TODO code application logic here
    }
    
}
