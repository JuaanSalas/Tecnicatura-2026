package C3_Ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ejercitacion: Detalles de libro con clase Scanner
        System.out.println("Ingrese el nombre del libro: ");
        var nombreLibro = entrada.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = entrada.nextLine();
        System.out.println("El libro \""+nombreLibro+"\" fue escrito por "+autor);
    }
    
}
