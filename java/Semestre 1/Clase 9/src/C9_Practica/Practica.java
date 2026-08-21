package C9_Practica;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        // Sentencia de control if else
        
        var condicion = true;
        if (condicion)
            System.out.println("Condicion Verdadera");// Condicional Simple
        else 
            System.out.println("Condicion Falsa");// Condicional doble
        
        // Practica: Conversion de numeros a texto con if, else if
        var numero = 4;
        var numTexto = "Numero desconocido";
        if (numero == 1){
            numTexto = "Numero uno";
        }
        else if (numero == 2){
            numTexto = "Numero dos";
        }
        else if (numero == 3){
            numTexto = "Numero tres";
        }
        else if (numero == 4){
            numTexto = "Numero cuatro";
        }
        System.out.println("numTexto = " + numTexto);
        
        // Practica: Estaciones del año
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un mes del anio: ");
        int mes = entrada.nextInt();
        var estacion = "Mes incorrecto";
        
        if (mes == 12 | mes == 1 | mes == 2){
            estacion = "Verano";
        }
        else if (mes >= 3 & mes <= 6){
            estacion = "Otonio";
        }
        else if (mes >= 7 & mes <= 9){
            estacion = "Invierno";
        }
        else if (mes >= 10 & mes <= 11){
            estacion = "Primavera";
        }
        
        System.out.println("Estacion: "+estacion);
        
        // Sentencia de Control Switch
        System.out.println("\nDigite un numero del 1 al 4");
        
        var num2 = entrada.nextInt();
        var numTexto2 = " ";
        
        switch (num2){
            case 1:
                numTexto2 = "Numero uno";
                break;
            case 2:
                numTexto2 = "Numero dos";
                break;
            case 3:
                numTexto2 = "Numero tres";
                break;
            case 4:
                numTexto2 = "Numero cuatro";
                break;
            default:
                numTexto2 = "Numero fuera de rango";
        }
        System.out.println("numTexto2 = " + numTexto2);
        
        // Ejercitacion de practica: Estaciones del año con switch
        System.out.println("\nDigite un mes del anio: ");
        var mes2 = entrada.nextInt();
        var estacion2 = "Desconocida";
        
        switch (mes2){
            case 12: case 1: case 2:
                estacion2 = "Verano";
                break;
            case 3: case 4: case 5:
                estacion2 = "Otonio";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion2 = "Primavera";
                break;
        }
        System.out.println("Estacion: "+ estacion2);
        
        // Ejercitacion de practica: Sistema de calificaciones
        System.out.println("\nDigite una calificacion entre 0  10: ");
        var dato = entrada.nextInt();
        
        if (dato == 10 | dato == 9){
            System.out.println("A");
        }
        else if (dato == 8){
            System.out.println("B");
        }
        else if (dato == 7 ){
            System.out.println("C");
        }
        else if (dato == 6){
            System.out.println("D");
        }
        else if (dato >= 0 & dato <= 5){
            System.out.println("F");
        }
        else {
            System.out.println("Fuera de rango");
        }

    }
    
}
