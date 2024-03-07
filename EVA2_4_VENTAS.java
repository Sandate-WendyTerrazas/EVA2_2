/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad, calcSaldo;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Cuantas piezas quieres comprar?");
        cantidad = captu.nextInt();
        
        if (cantidad > 1000)
            calcSaldo = cantidad * 500;
        else
            calcSaldo = cantidad * 800;
        System.out.println("El saldo es " + calcSaldo);
    }
    
}
