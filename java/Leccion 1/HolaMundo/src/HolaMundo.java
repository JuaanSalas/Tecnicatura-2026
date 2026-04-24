
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde java");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
        //
        // var - inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Reglas para definir una variable en java

        var usuario = "Juan";
        var titulo = "Estudiante";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var a = 8; //No se recomienda usar nombres cortos en variables
        var b = 4;
        System.out.println(usuario + (a + b));
        
        //Caracteres especiales con Java
        var nombre = "Juan";
        System.out.println("\nNueva linea: \n" + nombre);// salto de linea
        System.out.println("Tabulador: \t"+nombre);// tabulador(es un espacio ancho para centrar)
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b"+nombre);// caracter de retroceso(borra un espacio hacioa atras)
        System.out.println("Comillas simples \'"+nombre+"\'");// comillas simples
        System.out.println("Comillas dobles: \""+nombre+"\"");// comillas dobles

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2 );

    }
}
