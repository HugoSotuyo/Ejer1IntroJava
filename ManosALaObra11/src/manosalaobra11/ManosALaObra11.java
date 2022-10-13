/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra11;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ManosALaObra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        int largo;
        
        System.out.println("Ingrese Frase ");
        frase=leer.nextLine();
        largo=frase.length();
        String retorno=codificacion(frase,largo);
        System.out.println("La frase codificada es ");
        System.out.println(retorno);

    }
    public static String codificacion(String frase,int largo){
      String correccion="";
      String fraseminuscula=frase.toLowerCase();
      for (int i=0;i<(largo);i++){
          switch(fraseminuscula.substring(i, i+1)){
              case "a":
                  correccion=correccion.concat("@");
                  break;
              case "e":
                  correccion=correccion.concat("#");
                  break;
              case "i":
                  correccion=correccion.concat("$");
                  break;
              case "o":
                  correccion=correccion.concat("%");
                  break;
              case "u":
                  correccion=correccion.concat("*");
                  break;
              default:
                  correccion=correccion.concat(frase.substring(i, i+1));
          }
      }
        
        return correccion;
    }

}
