package Ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
        // Ejercitacion: Sistema de calificaciones con sentenacia if else
        
        System.out.println("Digite una calificacion: ");
        var calificacion = entrada.nextFloat();
        if (calificacion >= 9 & calificacion <= 10){
            System.out.println("A");
        }
        else if (calificacion >= 8 & calificacion < 9){
            System.out.println("B");
        }
        else if (calificacion >= 7 & calificacion < 8){
            System.out.println("C");
        }
        else if (calificacion >= 6 & calificacion < 7){
            System.out.println("D");
        }
        else if (calificacion >= 0 & calificacion < 6){
            System.out.println("F");
        }
        else {
            System.out.println("Calificacion no valida");
        }
        
        // Ejercitacion: Sistema de calificaciones con sentencia de control switch
        
        System.out.println("Ingrese una calificacion: ");
        var calificacion2 = entrada.nextInt();
        switch (calificacion2){
            case 10,9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5,4,3,2,1,0:
                System.out.println("F");
                break;
            default:
                System.out.println("Calificacion no valida");
        }
        
    }
}
