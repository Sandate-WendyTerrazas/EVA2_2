/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("Elige cara (1) o cruz (2):");
       int eleccionUsuario = scanner.nextInt();
       
       //GENERAR ALEATORIAMENTE CARA (1) O CRUZ (2)
       int eleccionMaquina = (int) (Math.random() * 2) + 1;
       
       if (eleccionUsuario == eleccionMaquina) {
           if (eleccionUsuario == 1 ) {
               System.out.println("Has elegido cara y has ganado");
           } else {
               System.out.println("Has elegido cruz y has ganado");
           }
       } else {
           if  (eleccionUsuario == 1) {
               System.out.println("Has elegido cara y has perdido");
           } else {
               System.out.println("Has elegido cruz y has perdido");
           }
       }
    }
    
}
