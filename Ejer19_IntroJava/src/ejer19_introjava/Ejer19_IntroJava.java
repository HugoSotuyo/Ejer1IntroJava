/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer19_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer19_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][]matriz;
        int n,valor;
        System.out.println("Ingreseel tamaño de la matriz cuadrada");
        n=leer.nextInt();
        matriz=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese elemento fila " + i + "columna " + j);
                matriz[i][j]=leer.nextInt();
            }
        }
        antisimetrica(matriz,n);
    }
    public static void antisimetrica(int [][]matriz,int n){
        int contador=0;
        int[][]matrizt=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizt[i][j]=matriz[j][i];
                
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizt[i][j]!=-matriz[i][j]){
                    contador=contador+1;
                }
                
            }
        }
       if (contador==0){
           System.out.println("La matriz ES antisimetrica");
       } else{
           System.out.println("La matriz NO es antisimetrica");
       }
    }
}
