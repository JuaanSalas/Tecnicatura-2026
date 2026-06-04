
package Practica;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        /*var condicion = false;
        if (condicion){
            System.out.println("Condicion verdadera");// Condicional simple
        }
        else {
            System.out.println("Condicion falsa");// Condicinal doble
        }
        
        var numero = 4;
        var numTexto = "x";
        if (numero == 1){
            numTexto = "Numero uno";
        }
        else if (numero == 2){
            numTexto = "Numero dos";
        }
        else if (numero == 3){
            numTexto = "Numero tres";
         }
        else if (numero == 4){
            numTexto = "Numero cuatro";
        }
        else if (numero == 5){
            numTexto = "Numero cinco";
        }
        else {
            numTexto = "Numero no encontrado";
        }
        System.out.println("numTexto: "+ numTexto);*/
        
        // Switch
                var entrada = new Scanner(System.in);
                
        System.out.println("Digite un numero del 1 al 4: ");
        var numero = entrada.nextInt();
        var numTexto = "Valo desconocido";
        switch (numero){
            case 1:
                numTexto = "Numero uno";
                break;
            case 2:
                numTexto = "Numero dos";
                break;
            case 3:
                numTexto = "Numero tres";
                break;
            case 4:
                numTexto = "Numero cuatro";
                break;
            default:
                numTexto = "Numero no encontrado";
        }
        System.out.println("numTexto = " + numTexto);
    }
    
}
