/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_operadores;

/**
 *
 * @author wendy
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMÉTICOS:
        //SUMA +, RESTA -, MULTIPLICACIÓN *, DIVISIÓN
        
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operador de suma +
        //si en el operador + uno de los terminos es 
        //una cadena, todo se convierte a cadena y se unen
        //concatenacion: union de cadenas de texto
        System.out.println("La suma es" + suma);
        boolean prueba = true;
        System.out.println("El valor de prueba es " + prueba);
        ///MULTIPLICACION *
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicacion es" + multi);
        //DIVISIÓN / 
        int divi = num1 / num2;
        System.out.println("La división de 7 / 2 es " + divi);
        double diviDouble = 7 / 2.0;
        System.out.println("La división (double) de 7 / 2 " + diviDouble);
        //ACUMULADORES
        //SUMA +=, RESTA -=, MULTI *=, DIVI /=
        int sumatoria = 0;
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;*/
        
        sumatoria += 90;//agrego 90 a sumatoria
        sumatoria +=80;//agrego 80 a sumatoria
        sumatoria += 80;//agrego 80 a sumatoria 
        System.out.println("La sumatoria es " + sumatoria);
        sumatoria -= 70;//le resto 70 a sumatoria
        //sumatoria = sumatoria - 70 
        System.out.println("La sumatoria es " + sumatoria);
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("Multiacum = " + multiAcum);
        multiAcum *=5;
        System.out.println("multiacum = " + multiAcum);
    }
    
}
