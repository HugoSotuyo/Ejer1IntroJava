/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer5_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,doble,triple;
        double resultado;
        
        System.out.println(" Ingrese un numero ENTERO ");
        num= leer.nextInt();
        doble=num*2;
        triple = num*3;
        resultado = Math.sqrt(num);
        
        System.out.println(" Laraiz cuadrada es ; " + resultado);
        System.out.println(" El doble es " + doble);
        System.out.println(" El triple es " + triple);
                
        // TODO code application logic here
    }
    
}
