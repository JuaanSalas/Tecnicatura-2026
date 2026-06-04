package Ejercitacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercitacion: Determinar si un alumno aprueba o repureba un curso, sabiendo que aprobara si el promedio
        // de sus tres calififcaciones es mayor o igual a 7
        var entrada = new Scanner(System.in);
        
        float calificacion1, calificacion2, calificacion3, promedio;
        
        System.out.println("Digite la primer calificacion: ");
        calificacion1 = entrada.nextFloat();
        
        System.out.println("Digite la segunda calificacion: ");
        calificacion2 = entrada.nextFloat();
        
        System.out.println("Digite la tercer calificacion: ");
        calificacion3 = entrada.nextFloat();
        
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
        
        if (promedio >= 7) {
            System.out.println("Aprobo el curso: "+ promedio);
        }
        else {
            System.out.println("Reprobo el curso: "+ promedio);
        }

    }
    
}
