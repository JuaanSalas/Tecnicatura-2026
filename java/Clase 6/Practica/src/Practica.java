
import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        System.out.println("Hola " + "mundo");
        // Tipos primitivos tipo booleano
        /*var varBool = false;
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es verde");
        } 
        else {
            System.out.println("La bandera es roja");
        }
        // Algoritmo : ¿Es mmayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        var adulto = edad >= 18; //Exprecion booleana
        if (adulto) {
            System.out.println("Es mayor de edad");
        } 
        else {
            System.out.println("Es menor de edad");
        }
        // Conversion de tipos primitivos
        var edad = Integer.parseInt("20");
        System.out.println ("edad = " + (edad + 10));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);*/
        
        // Pedir un valor
        var entrada = new Scanner(System.in);
//        System.out.println("Digite su edad: ");
//        edad = Integer.parseInt (entrada.nextLine());
//        System.out.println("Su edad es: " + edad);
        
        // Seguimos con la conversion de tipos primitivos en java
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "programadores".charAt(3);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
    }
    
}
