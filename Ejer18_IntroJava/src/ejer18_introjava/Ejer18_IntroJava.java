/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer18_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer18_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese valor");
                matriz[i][j]=leer.nextInt();
            }
        }
     traspuesta(matriz);   
    }
    

    public static void traspuesta(int[][]matriz){
        int [][] matrizt= new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizt[i][j]=matriz[j][i];
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizt[i][j] + "]");
            }
            System.out.println("");
        }
}
}
