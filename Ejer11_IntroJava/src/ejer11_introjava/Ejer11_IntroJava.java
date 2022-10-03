/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11_introjava;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer11_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        int resultado=0;
        int opcion;
        String salir = "N";
        
        System.out.println("Ingrese 2 numeros enteros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        //while(opcion!=5){
         do{
        
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        
        System.out.println("Elija una operacion de el MENU");
        opcion=leer.nextInt();
            switch (opcion){
              case 1:
              resultado=num1+num2;
              System.out.println("El resultado es= " + resultado);
              break;
              case 2:
              resultado=num1-num2;
              System.out.println("El resultado es= " + resultado);
              break;
              case 3:
              resultado=num1*num2;
              System.out.println("El resultado es= " + resultado);
              break;
              case 4:
              resultado=num1/num2;
              System.out.println("El resultado es= " + resultado);
              break;
              case 5:
              System.out.println("¿Esta seguro que desea salir del programa S/N?");
              salir = leer.next();
              break;
            
            }
            
          } while (salir.equalsIgnoreCase("N"));
         
        }
      }
    
    
    
