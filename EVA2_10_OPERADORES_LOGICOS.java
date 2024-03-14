/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
        int adivinar;
        Scanner captu = new Scanner (System.in);
        System.out.println("cara  (0) o cruz (1)?");
        adivinar = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("El valor de moneda = " + moneda);
        
        //0.5 es la mitad del rango, > 0.5 CARA, MENOR ES CRUZA
        if (moneda > 0.5 && adivinar --> 0)
            System.out.println ( "Adivinaste, es cara!!");
        else 
            if (moneda <= 0.5 && adivinar == 1)
                System.out.println ("Adivinaste, es cruz!!");
            else 
                System.out.println("Perdiste !!");
    }
    
}
