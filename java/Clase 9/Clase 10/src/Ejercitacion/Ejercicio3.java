package Ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercicio 3: Calificacion final de estudiante
        Scanner entrada = new Scanner(System.in);
        float calificacionFinal, nota1, nota2, nota3, nota4;
        System.out.println("Digite la calificacion por participacion: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite la calificacion del primer examen parcial: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite la calificacion del segundo examen parcial: ");
        nota3 = entrada.nextFloat();
        System.out.println("Digite la calificacion del examen final: ");
        nota4 = entrada.nextFloat();
        calificacionFinal = (nota1 * 0.1f) + (nota2 * 0.25f) + (nota3 * 0.25f) + (nota4 * 0.40f);
        System.out.println("La calificacion final es: "+ calificacionFinal);

    }
    
}
