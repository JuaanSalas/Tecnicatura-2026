package C7_Ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ejercicio 3: El m,ayor de dos numeros. Operador Ternario
        var entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite nuevamente un numero: ");
        num2 = entrada.nextInt();
        var resultado = (num1 > num2) ? num1 : num2;
        System.out.println("El numero mayor es: "+ resultado);
    }
    
}
