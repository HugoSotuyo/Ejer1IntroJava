/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer4_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Centigrados");
        int gradosCent = leer.nextInt();
        int gradosF;
        gradosF = 32 + (9* gradosCent /5);
        System.out.println(" La temperatura en grados Fahrenheit es:" + gradosF);
        // TODO code application logic here
    }
    
}
