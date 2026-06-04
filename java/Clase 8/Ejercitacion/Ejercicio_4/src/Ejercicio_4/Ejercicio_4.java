package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        // Ejercicio 4: Leer dos numeros, si son iguales multiplicarlos, si el primero
        // es mayor restarlos, y sino sumarlos
        var entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num1, num2, resultado;
        num1 = entrada.nextInt();
        System.out.println("Digite un numero: ");
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
