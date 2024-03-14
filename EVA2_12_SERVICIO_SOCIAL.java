/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_12_SERVICIO_SOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos, semestre;
        Scanner captu = new Scanner (System.in);
        System.out.println("Que semestres cursas?");
        semestre = captu.nextInt();
        
        System.out.println("Cuantos creditos llevas?");
        creditos = captu.nextInt();
        
        //INDICAR SI SE PUEDE O NO REALIZAR EL SERVICIO SOCIAL
        //IR EN 6TO SEMESTRE O SUPERIOR (semestre >= 6)
        //TENER AL MENOS 150 CREDITOS (creditos >= 150)
        if ((semestre >= 6) && (creditos >= 150))
            System.out.println("Puedes realizar el servicio social");
        else
            System.out.println("No puedes realizar el servicio social");
    }
    
}
