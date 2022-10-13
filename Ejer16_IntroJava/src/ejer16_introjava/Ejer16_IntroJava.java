/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer16_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n,numero;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        int[]num=new int[n];
        System.out.println("Ingrese el numero que desea buscar");
        numero=leer.nextInt();
        busqueda(num,numero,n);
    }
    public static void busqueda(int[]num,int numero,int n){
        int contador=0;
        for (int i=0;i<n;i++){
            num[i]=(int)(Math.random()*10);
        }
        for (int i=0;i<n;i++){
            if (num[i]==numero){
                System.out.println("El numero se encuentra en la posicion " + i);
                contador=contador +1;
            }
        }
        switch (contador){
            case 0:
                System.out.println("El numero no se encuentra en este vector");
            break;
            default:
                System.out.println("El numero se encuentra " + contador + " veces ");
        }
    }
}
