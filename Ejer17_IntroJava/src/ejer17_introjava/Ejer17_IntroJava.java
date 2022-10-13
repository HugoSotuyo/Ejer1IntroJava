/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer17_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer17_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int n;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        int[]vector;
        vector = new int[n];
        digitos(vector,n);
    }
    public static void digitos(int[]vector,int n){
        double resultado;
        int undigito=0;
        int dosdigito=0;
        int tresdigito=0;
        int cuatrodigito=0;
        int cincodigito=0;
        int num;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese los elementos del vector, pueden de hasta 5 digitos");
        for (int i = 0; i < n; i++) {
            System.out.println("Numero " + i+1);
            
            vector[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num=0;
            resultado=vector[i];
            while (resultado>1){
            resultado=resultado/10;
            num=num+1;
            }
            switch(num){
                case 1:
                    undigito=undigito+1;
                    break;
                 case 2:
                    dosdigito=dosdigito+1;
                    break;
                case 3:
                    tresdigito=tresdigito+1;
                    break;
                case 4:
                    cuatrodigito=cuatrodigito+1;
                    break;
                case 5:
                    cincodigito=cincodigito+1;
                    break;    
            }
    }
        System.out.println("Hay " + undigito + " numeros de un digito");
        System.out.println("Hay " + dosdigito + " numeros de dos digito");
        System.out.println("Hay " + tresdigito + " numeros de tres digito");
        System.out.println("Hay " + cuatrodigito + " numeros de cuatro digito");
        System.out.println("Hay " + cincodigito + " numeros de cinco digito");
}
}