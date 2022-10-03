/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6_introjava;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer6_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        double resultado,comparacion;
        
        System.out.println(" Ingrese un numero entero ");
        num = leer.nextInt();
        resultado = num/2;
        comparacion = resultado - floor(resultado);
        System.out.println("comparacion" + comparacion);
        if (comparacion == 0.0){
            System.out.println("El numero es PAR ");
        } else {
            System.out.println("El numero ingresado es Impar");
        }
        }
    }
    
        
