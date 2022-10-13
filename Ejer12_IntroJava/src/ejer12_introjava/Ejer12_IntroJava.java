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
        
        
        int contador;
        int longitud;
         contador=0;
        
        String secuencia;
        
        String fde="&&&&&";
        do{
        System.out.println("Ingrese la secuencia");
        secuencia=leer.nextLine();
        longitud=secuencia.length();
        
       
        
        
        if (longitud<=5 && secuencia.substring(0,1).equalsIgnoreCase("x")
                && secuencia.substring(secuencia.length()-1).equalsIgnoreCase("o"))
        {
            contador=contador + 1;
        }
        }while (!secuencia.equals(fde));        /*while (fde.equals("xxxxx")){
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
        
        System.out.println("La cantidad de lecturas correctas es : " + contador); 
    }
}
  
