/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calificacion;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion (0 - 100) : ");
        calificacion = captu.nextInt();
        
        if(calificacion >= 90 && calificacion <= 100) // A
            System.out.println("Tu calificacion es A");
        
        else if(calificacion >= 80 && calificacion <= 89) //B
                System.out.println("Tu calificacion es B");
        
        else if(calificacion >= 70 && calificacion <= 79) //C
                System.out.println(" tu calificacion es C");
        
        else if(calificacion >= 60 && calificacion <= 69) //D
                System.out.println("Tu calificacion es D");
        
        else if(calificacion >= 0 && calificacion <= 59) //F
                System.out.println("Tu calificacion es F");
        
        else 
             System.out.println("Calificacion no valida");
    }
    
}
