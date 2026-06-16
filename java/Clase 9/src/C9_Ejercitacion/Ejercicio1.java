package C9_Ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercitacion: Sistema de calificaciones con switch
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una nota entre 0 y 10: ");
        var nota = entrada.nextInt();
        var calificacion = "";
        
        switch (nota){
            case 10: case 9:
                calificacion = "A";
                break;
            case 8:
                calificacion = "B";
                break;
            case 7:
                calificacion = "C";
                break;
            case 6:
                calificacion = "D";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                calificacion = "F";
                break;
            default:
                calificacion = "Fuera de rango";
                break;
        }
        System.out.println("Calificacion: "+ calificacion);
    }
    
}
