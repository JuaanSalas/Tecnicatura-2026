package C9_Ejercitacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Ejercitacion: Determinar si un alumno aprueba o reprueba un cursop, sabiendo que aprueba si el promedio de
        // sus tres calificaciones es mayor o igual a 7
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3;
        float promedio;
        System.out.println("Digite la primer calificacion: ");
        nota1 = entrada.nextInt();
        System.out.println("Digite la segunda calificacion: ");
        nota2 = entrada.nextInt();
        System.out.println("Digite la tercer calificacion: ");
        nota3 = entrada.nextInt();
        
        promedio = (nota1 + nota2 + nota3) / 3;
        
        if (promedio >= 7)
            System.out.println("Aprueba el curso: "+promedio);
        else {
            System.out.println("Reprueba el curso: "+promedio);
        }
    }
}
