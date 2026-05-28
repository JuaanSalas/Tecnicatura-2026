package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el segundo numero: ");
        var num2 = Integer.parseInt(entrada.nextLine());
        var mayor = (num1 > num2) ? num1 : num2 ;
        System.out.println("El numero mayor es: " + mayor);
    }
    
}
