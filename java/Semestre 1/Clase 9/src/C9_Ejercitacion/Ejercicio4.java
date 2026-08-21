package C9_Ejercitacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercitacion: Leer dos numeros: si son iguales multiplicarlos, si el primero es mayor restarlos,
        // de lo contrario sumarlos
        
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;
        
        System.out.println("Digite un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite un numero nuevamente: ");
        num2 = entrada.nextInt();
        
        if (num1 == num2){
            resultado = num1 * num2;
        } else if (num1 > num2){
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }
        
        System.out.println("El resultado es: "+ resultado);
    }
    
}
