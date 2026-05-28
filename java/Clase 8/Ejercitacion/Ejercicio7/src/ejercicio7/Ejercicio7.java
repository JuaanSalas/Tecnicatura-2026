package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        /* Ejercicio 7: Una compañia de carros usados paga a su personal de venta un salario de
        $1000 mensuales mas una comision de $150 por cada carro vendido mas el 5% del valor de la 
        venta por carro:
        Hacer un programa que imprima el salario mensual de un vendedor dado.*/
        var entrada = new Scanner(System.in);
        final float salarioTotal;
        float salarioMensual, comision, comision2, carro, carrosVendidos;
        
        System.out.println("Digite el precio del carro vendido: ");
        carro = entrada.nextFloat();
        System.out.println("Digite la cantidad de carros vendidos: ");
        
        carrosVendidos = entrada.nextFloat();
        salarioMensual = 1000;
        comision = 150 * carrosVendidos;
        comision2 = (carro * carrosVendidos) * 0.05f;
        salarioTotal = salarioMensual + comision + comision2;
        
        System.out.println("El salario mensual es: $" + salarioTotal);
    }

}
