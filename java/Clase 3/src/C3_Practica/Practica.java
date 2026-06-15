package C3_Practica;

import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        // Clase 2
        // Tipos de datos en Java

        // Tipo int (entero)
        /*
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 6;
        System.out.println(miVariable);

        // Tipo string (cadena)
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
        */

        // Clase 3
        // Var - Inferencia de tipos en Java
        var miVariableEntera = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        // Soutv + tab
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        // Reglas para definir una variable en java
        //var 1miVariableEjemplo = 45;
        //var mi-Variable.Ejemplo = 12;
        //var continue = 10; // No se deben utilizar palabras reservadas del lenguage
        var miVariableEjemplo_$ = 15; // El _ y $ se permiten en el nombre de una variable

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 5;
        var b = 10;
        System.out.println(a + b);// Lee de izq. a derecha, se realiza la suma
        System.out.println(usuario + a + b);// Contexto de cadena, concatena
        System.out.println(usuario + (a + b)); // El () modifica la prioridad de operadores

        // Caracteres especiales en Java
        var nombre = "Juan"; //Codigo duro: asignar nombre/identificador a la variable
        System.out.println("\nNueva linea \n" + nombre); // Salto de linea: \n
        System.out.println("Tabulador: \t" + nombre); // Tabulador: \t
        System.out.println("\t.MENU:"); // Ejemplo de tabulacion
        System.out.println("Retroceso: \b"+nombre); // Caracter de retroceso: \b borra el espacio anterior al este caracter
        System.out.println("Comillas simlples: \'"+nombre+"'"); // Comillas simpples: "\'"      "'"
        System.out.println("Comillas dobles: \""+nombre+"\""); // Comillas dobles: "\""     "\""
        
        // Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usario2 = " + usuario2);
    }

}
