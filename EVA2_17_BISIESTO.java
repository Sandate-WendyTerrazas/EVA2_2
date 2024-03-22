/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anio;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce el año a evaluar:");
        
        anio = captu.nextInt();
        
        if (anio %100 != 0)
            if (anio %4 ==0)
                System.out.println("Bisiesto");
            else
                System.out.println("No Bisiesto");
        else if (anio % 400 == 0)
            System.out.println("Bisiesto");
        else
            System.out.println("No Bisiesto");
    }
    
}
