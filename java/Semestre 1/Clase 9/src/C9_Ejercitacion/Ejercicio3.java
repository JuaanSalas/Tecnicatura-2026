package C9_Ejercitacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercitacion: En un almacen se ofrece un 20% de descuento a personas cuya compra supere los 100
        // Realizar un programa que calcule cual sera la cantidad que tendra que pagar una persona por su compra
        
        Scanner entrada = new Scanner(System.in);
        float compra, descuento, totalCompra;
        System.out.println("Digite el precio de la compra: ");
        compra = entrada.nextFloat();
        
        if (compra > 100)
            descuento = compra * 0.2F;
        else 
            descuento = 0;
        totalCompra = compra - descuento;
        
        System.out.println("Total a pagar: $"+totalCompra);
    }
    
}
