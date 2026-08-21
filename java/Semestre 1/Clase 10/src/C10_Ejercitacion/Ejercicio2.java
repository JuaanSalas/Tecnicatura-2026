package C10_Ejercitacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Ejercitacion: Programa que calcule el cuadro de una suma, el usuario debe ingresar el valor de a y de b
        // Formula: (a+b)2=a2+b2+2*a*b
        
        Scanner entrada = new Scanner(System.in);
        double a, b, resultado;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) +(2 * a * b);
        
        System.out.println("\nEl cuadrado de la suma es: " + resultado);
    }
    
}
