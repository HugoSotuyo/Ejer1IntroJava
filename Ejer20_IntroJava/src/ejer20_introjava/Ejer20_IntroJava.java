/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer20_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][]matriz=new int [3][3];
        int num;
        System.out.println("Ingrese un numero entero entre 1 y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Fila "+ i +" Columna "+ j);
                num=leer.nextInt();
                if(num>0 && num<10){
                    matriz[i][j]=num;
                }else{
                    System.out.println("Numero incorrecto, ingrese la matriz nuevamente");
                    i=0;
                    j=0;
                }
                
            }
        }
        magica(matriz);
    }
    public static void magica(int[][]matriz){
        int base=0;
        int sumaf;
        int sumac;
        int sumad;
        int sumadi;
        boolean esmagica=true;
        for (int i = 0; i < 3; i++) {
            base=base+matriz[i][0];
        }
        for (int i = 0; i < 3; i++) {
            sumaf=0;
            sumac=0;
            sumad=0;
            sumadi=0;
            for (int j = 0; j < 3; j++) {
                sumaf=sumaf+matriz[i][j];
                sumac=sumac+matriz[j][i];
                sumad=sumad+matriz[j][j];
                sumadi=sumadi+matriz[j][2-j];
                if(j==2 && (sumaf!=base || sumac!=base || sumad!=base || sumadi!=base)){
                    esmagica=false;
                    System.out.println("NO ES MAGICA");
                    i=3;
                }else{
                    esmagica=true;
                }
            }
        }
        if (esmagica==true){
            System.out.println("La matriz es magica");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("["+ matriz[i][j]+"]");
                }
                System.out.println("");
            }
        }
    }
}
