/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_volado;

/**
 *
 * @author wendy
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numero aleatorio en Jva: 
        //valores entre 0 y 1.
        // 0.313534354354
        // 0.635345454
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de moneda = " + moneda);
        
        // 0.5 es la mitad del rango
        if (moneda > 0.5)
            System.out.println("CARA");
        else 
            System.out.println("CRUZ");
    }
    
}
