package C7_Ejercitacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Ejercicio 2: Hacer un progrrama para calcular el area y el preimetro de un rectangulo
        var entrada = new Scanner(System.in);
        int ancho, alto, perimetro, area;
        
        System.out.println("Digite el ancho del rectangulo: ");
        ancho = entrada.nextInt();
        System.out.println("Digite el alto del rectangulo: ");
        alto = entrada.nextInt();
        
        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        
        System.out.println("El area del rectangulo es: "+ area);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
    
}
