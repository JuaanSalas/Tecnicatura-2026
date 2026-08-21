package C8_Ejercitacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Ejercitacion: Guilleromo tiene n dolares, Luis la mitad de Guillermo y Juan la mitad de lo de Luis y Guillermo juntos
        // Hacer un programa que caclule e imprima la cantidad de dinero que poseen entre los tres
        Scanner entrada = new Scanner(System.in);
        
        float guillermo, luis, juan, total;
        
        System.out.println("Digite la cantidad de dolares de Guillermo: ");
        guillermo = entrada.nextFloat();
        luis = guillermo / 2;
        juan = (luis + luis) / 2;
        
        total = guillermo + luis + juan;
        
        System.out.println("\nDolares de Guillermo: US$ "+ guillermo);
        System.out.println("Dolares de Luis: US$"+ luis);
        System.out.println("Dolares de Juan: US$"+ juan);
        System.out.println("\nEl total de dolares es: US$"+ total);
    }
    
}
