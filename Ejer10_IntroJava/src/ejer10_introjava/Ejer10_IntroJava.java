/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer10_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite,valor;
        int suma=0;
        System.out.println("Ingrese el valor limite positivo de la suma");
        limite = leer.nextInt();
        while(suma<=limite){
            System.out.println("Ingrese un entero");
            valor=leer.nextInt();
            suma=suma+valor;
        }
        System.out.println("La suma excede el limite positivo");
    }
    
}
