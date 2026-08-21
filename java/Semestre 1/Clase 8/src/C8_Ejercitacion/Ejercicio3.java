package C8_Ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercitacion: Una compañia de ventas de carros usados paga por su personal de ventas un salario de $1000 menusales
        // mas una comision de $150 por cada carro vendido, mas el 5% del valor de la venta por carro.
        // Hacer un programa que calcule e imprima el salario mensual de un vendedor dado
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150, ventas;
        float comisionVenta, ventaCarro, salarioMensual, totalPrecio;
        
        System.out.println("Digite la cantidad de carros vendidos: ");
        ventas = entrada.nextInt();
        System.out.println("Digit el precio del carro: ");
        ventaCarro = entrada.nextFloat();
        
        comision *= ventas;
        totalPrecio = ventaCarro * ventas;
        comisionVenta = totalPrecio * 0.5f;
        salarioMensual = salario + comision + comisionVenta;
        
        System.out.println("El salario mensual del vendedor es: $"+salarioMensual);
                
    }
    
}
