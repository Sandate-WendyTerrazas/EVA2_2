/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_if2;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_3_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double califa;
        Scanner captu = new Scanner (System.in);
        califa = captu.nextDouble ();
        if (califa >= 70){
            System.out.println("Aprobaste!!!");
        } else//la evaluacion fase es opcional
        System.out.println("No Aprovaste!!");
            
            
            
    }
    
}
