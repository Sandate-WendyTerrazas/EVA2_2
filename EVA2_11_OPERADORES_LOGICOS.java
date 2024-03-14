/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_operadores_logicos;

/**
 *
 * @author wendy
 */
public class EVA2_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean  hayDinero, hayBuenClima;
        // para hacer la carne asada se necesira:
        // haya dinero y haya buen clima
        hayDinero = false;
        hayBuenClima = false;
        
        System.out.println("1. NO HAY DINERO NO HAY BUEN CLIMA");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMÓ LA CARNITA!!");
        else 
            System.out.println("BUEVITO");
        
         hayDinero = false;
        hayBuenClima = true;
        
        System.out.println("2. NO HAY DINERO Y HAY BUEN CLIMA");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMÓ LA CARNITA!!");
        else 
            System.out.println("BUEVITO");
        
         hayDinero = true;
        hayBuenClima = false;
        
        System.out.println("3. HAY DINERO Y NO HAY BUEN CLIMA");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMÓ LA CARNITA!!");
        else 
            System.out.println("BUEVITO");
        
         hayDinero = true;
        hayBuenClima = true;
        
        System.out.println("4. HAY DINERO Y HAY BUEN CLIMA");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMÓ LA CARNITA!!");
        else 
            System.out.println("BUEVITO");

    }
    
}
