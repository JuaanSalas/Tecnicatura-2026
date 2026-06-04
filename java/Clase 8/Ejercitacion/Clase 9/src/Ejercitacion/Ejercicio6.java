package Ejercitacion;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        // Ejercitacion: Leer dos numeros, si son iguales multiplicarlos, si el primero es mayor restarlos, de otra manera sumarlos
        
        int num1, num2, resultado;
        
        System.out.println("Digite el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo nunmero: ");
        num2 = entrada.nextInt();
        
        if (num1 == num2){
            resultado = num1 * num2;
        }
        else if (num1 > num2){
            resultado = num1 - num2;
        }
        else {
            resultado = num1 + num2;
        }
        
        System.out.println("El resultado es: "+ resultado);

    }
    
}
