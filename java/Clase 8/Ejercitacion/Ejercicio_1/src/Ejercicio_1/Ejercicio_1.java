package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Ejercitacion: Determinar si un alumno reprueba un curso, sabiendo que aprobara si el promedio
        // de sus tres calificaciones es mayor o igual a 7
        var entrada = new Scanner(System.in);
        
        float calificacion1, calificacion2, calificacion3, calificacionFinal;
        
        System.out.println("Digite la primer calificacion: ");
        calificacion1 = entrada.nextFloat();
        
        System.out.println("Digite la segunda calificacion: ");
        calificacion2 = entrada.nextFloat();
        
        System.out.println("Digite la tercer calificacion: ");
        calificacion3 = entrada.nextFloat();
        
        calificacionFinal = (calificacion1 + calificacion2 + calificacion3)/3;
        
        if (calificacionFinal >= 7) {
            System.out.println("Aprobo el curso: "+ calificacionFinal);
        }
        else {
            System.out.println("Reprobo el curso: "+ calificacionFinal);
        }
    }
    
}
