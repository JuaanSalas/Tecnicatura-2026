package C6_Ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercitacion: Tienda de libros
        var entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito (true o false): ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println("Nombre del libro: \""+nombreLibro+"\" #"+idLibro);
        System.out.println("Precio del libro: $"+precioLibro);
        if (envioGratuito == true){
            System.out.println("Envio: gratuito");
        }
        else {
            System.out.println("Envio: no gratuito");
        }
    }
    
}
