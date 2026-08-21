package C10_Ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercitacion: Hacer un programa que, dado un numero total de horas, nos devuelva el numero de semanas, dias
        // y horas equivalentes
        
        Scanner entrada = new Scanner(System.in);
        
        int horas, semanas, dias, horas2;
        System.out.println("Digite el numero de horas: ");
        horas = entrada.nextInt();
        
        semanas = horas / 168;
        horas %= 168;
        dias = horas / 24;
        horas2 = horas % 24;
        
        System.out.println("\nSemanas: "+ semanas);
        System.out.println("Dias: "+ dias);
        System.out.println("Horas: "+horas2);
    }
    
}
