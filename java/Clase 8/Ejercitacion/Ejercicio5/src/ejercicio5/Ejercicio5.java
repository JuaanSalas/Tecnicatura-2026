package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int nota1, nota2, nota3, suma;
        System.out.println("Digite la primer calificacion: ");
        nota1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite la segunda calificacion: ");
        nota2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite la tercer calificacion: ");
        nota3 = Integer.parseInt(entrada.nextLine());
        suma = nota1 + nota2 + nota3;
        System.out.println("El resultado de la suma de las calificaiones es: " + suma);
    }
    
}
