package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        float dolaresG, dolaresL, dolaresJ, suma;
        System.out.println("Digite la cantidad de dolares que posee Guillermo: ");
        dolaresG = entrada.nextFloat();
        dolaresL = dolaresG / 2;
        dolaresJ = (dolaresG + dolaresL) / 2;
        suma = dolaresG + dolaresL + dolaresJ;
        System.out.println("La cantidad de dinero que poseen entre Guillermo, Luis y Juan es: $" + suma);
    }
    
}
