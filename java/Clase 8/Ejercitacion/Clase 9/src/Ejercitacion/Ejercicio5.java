package Ejercitacion;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
        double precioCompra, precioFinal, descuento;
        
        System.out.println("Digite el precio de la compra: ");
        precioCompra = entrada.nextDouble();
        
        if (precioCompra > 100){
            descuento = precioCompra * 0.2;
        }
        else {
            descuento = 0;
        }
        
        precioFinal = precioCompra - descuento;
        System.out.println("El precio a pagar es de: $"+ precioFinal);

    }
}
