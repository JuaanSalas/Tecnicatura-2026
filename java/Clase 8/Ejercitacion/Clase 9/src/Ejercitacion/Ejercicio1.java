
package Ejercitacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicitacion: Calcular estaciones del año con if else
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese un mes del anio: ");
        var mes = entrada.nextInt();
        var estacion = "Estacion desconocida";
        if (mes >= 1 & mes <= 3){
            estacion = "Verano";
        }
        else if (mes >= 4 & mes <= 6){
            estacion = "Otonio";
        }
        else if (mes >= 7 & mes <= 9){
            estacion = "Invierno";
        }
        else if (mes >= 10 & mes <= 12){
            estacion = "Primavera";
        }
        System.out.println("Estacion: "+ estacion);

    }
    
}
