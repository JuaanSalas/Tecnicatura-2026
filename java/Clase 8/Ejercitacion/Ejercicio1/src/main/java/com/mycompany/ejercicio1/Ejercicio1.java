
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) { 
        // Ejercitacion: Determinar si un alumno reprueba un curso, sabiendo que aprobara si el promedio
        // de sus tres calificaciones es mayor o igual a 7
        var entrada = new Scanner(System.in);
        System.out.println("Digite la primer calificacion: ");
        var calificacion1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la segunda calificacion: ");
        var calificacion2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la tercer calificacion: ");
        var calificacion3 = Float.parseFloat(entrada.nextLine());
        var calificacionFinal = calificacion1 + calificacion2 + calificacion3;
        if (calificacionFinal >= 7) {
            System.out.println("Aprobo el curso: "+ calificacionFinal);
        }
        else {
            System.out.println("Reprobo el curso: "+ calificacionFinal);
        }

    }
}
