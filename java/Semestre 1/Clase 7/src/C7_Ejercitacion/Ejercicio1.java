package C7_Ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 1: Hacer un programa que calcule e imprima el salario de un empleado,
        // a partir de sus horas semanales trabajadas y de su salario por hora.
        var entrada = new Scanner(System.in);
        float salarioTotal, salarioHora, horasSemanales;
        System.out.println("Ingrese el salario por hora: ");
        salarioHora = entrada.nextFloat();
        System.out.println("Ingrese las horas semanales trabajadas: ");
        horasSemanales = entrada.nextFloat();
        salarioTotal = salarioHora * horasSemanales;
        System.out.println("El salario semanal es: $"+salarioTotal);
    }
    
}
