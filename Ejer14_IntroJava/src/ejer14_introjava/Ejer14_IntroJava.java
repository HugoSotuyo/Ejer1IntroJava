/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer14_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String cadena;
       double monto;
        System.out.println("Ingrese la moneda a convertir a euros");
        System.out.println("dolares,yenes,libras");
        cadena=leer.next();
        System.out.println("Ingrese el monto");
        monto=leer.nextInt();
       conversion(cadena,monto);
    }
    public static void conversion(String cadena,double monto){
        double cambio;
        switch(cadena){
            case "dolares":
                cambio=monto*1.28611;
                System.out.println("El cambio es " + cambio + " dolares");
                break;
            case "yenes":
                cambio=monto*129.852;
                System.out.println("El cambio es " + cambio + " yenes");
                break;
             case "libras":
                cambio=monto*0.86;
                 System.out.println("Elcambio es " + cambio + " libras");
                break;
             default:
                 System.out.println("Error de moneda");
        }
           
    }
}
