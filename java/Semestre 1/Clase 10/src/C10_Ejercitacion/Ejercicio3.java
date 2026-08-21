package C10_Ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercitacion: La calificacion final de un estudiante se calcula en base a las calificaciones de
        // cuatro aspectos de su rendimiento academico: participacion (10%), primer examen parcial (25%),
        // segundo examen parcial (25%), y examen final (40%)
        // Hacer un programa que calcule la calificacion final
        
        Scanner entrada = new Scanner(System.in);
        double calificacionFinal, nota1, nota2, nota3, nota4;
        
        System.out.println("Digite la nota por participacion: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite la nota del primer examen parcial: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite la nota del segundo examen parcial: ");
        nota3 = entrada.nextDouble();
        System.out.println("Digite la nota del examen final: ");
        nota4 = entrada.nextDouble();
        
        calificacionFinal = (nota1 * 0.1) + (nota2 * 0.25) + (nota3 * 0.25) + (nota4 * 0.4);
        
        System.out.println("\nLa calificacion final del estudiante es: "+ calificacionFinal);
    }
    
}
