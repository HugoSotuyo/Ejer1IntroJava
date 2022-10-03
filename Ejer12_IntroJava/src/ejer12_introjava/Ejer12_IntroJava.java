/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer12_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ini;
        int fin;
        int contador;
        int n=0;
        int l;
        int salida;
        String frase;
        String letra;
        String fde;
        String finsec;
        System.out.println("Ingrese la secuencia");
        frase=leer.next();
        l=frase.length();
        ini=0;
        contador=0;
        salida=0;
        fde="xxxxx";
        /*while (fde.equals("xxxxx")){
            for (n=0;n<l-1;n++){
            
            letra=frase.substring(n,n+1);
            
                switch (letra){
                case "x":
                    ini=n;
                    break;
                case "o":
                    if(ini!=0){
                        fin=n;
                        contador=contador+1;
                    }
                case "&":
                    fde="hh";
                }
            }
        }*/
        do {
            for (n=0;n<l-1;n++){
            
            letra=frase.substring(n,n+1);
            
                switch (letra){
                case "x":
                    ini=n;
                    break;
                case "o":
                    if(ini!=0){
                        fin=n;
                        contador=contador+1;
                    }
                case "&":
                    fde="hh";
                }
            }
        }while (fde.equals("xxxxx"));
        System.out.println("La cantidad de lecturas correctas es : " + contador); 
    }
}
  
