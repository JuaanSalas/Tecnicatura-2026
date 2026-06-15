package C5_Practica;

public class Practica {

    public static void main(String[] args) {
        /*
        // Clase 2
        // Tipos de datos en Java

        // Tipo int (entero)
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 6;
        System.out.println(miVariable);

        // Tipo string (cadena)
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);

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
         */

        // Clase 4
        // Tipos numericos enteros
        // Tipo Byte
        /*
        byte numEnteroByte = 127;
        System.out.println("numeroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: "+ Byte.MIN_VALUE); // Valor minimo
        System.out.println("Valor maximo del byte: "+ Byte.MAX_VALUE); // Valor maximo
        
        // Tipo Short
        short numEnteroShort = (short)32768;
        System.out.println("\nnumEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del short: "+ Short.MAX_VALUE);
        
        // Tipo Int
        int numEnteroInt = 2147483647;
        System.out.println("\nnumEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE);
        System.out.println("Vallor maximo del int: "+ Integer.MAX_VALUE);
        
        // Tipo Long
        long numEnteroLong = 9223372036854775807L;
        System.out.println("\nnumEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del long: "+ Long.MAX_VALUE);
        
        // Tipos flotantes
        
        // Tipo float
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimmo del float: "+ Float.MIN_VALUE);
        System.out.println("Valor maximo del float: "+ Float.MAX_VALUE);
        
        // Tipo double
        double numDouble = 1.7976931348623157E308;
        System.out.println("\nnumDouble = " + numDouble);
        System.out.println("Valor minimmo del double: "+ Double.MIN_VALUE);
        System.out.println("Valor maximo del double: "+ Double.MAX_VALUE);
         */
        
        
        // Clase 5
        // Inferencia de tipos var y tipos primitivos
        var numEntero = 20; // Las literales sin punto automaticamente son de tipo str
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0; // Con el . (punto) automaticamente se convierte en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);

        // Tipos primitivos char
        var miVariableChar = 'a';
        System.out.println("\nmiVariableChar = " + miVariableChar);

        char varCaracter = '\u0024'; // Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; // Valor decimal con el juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; // UN caracter especial, podemos copiar y pegar de unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        System.out.println("\n");
        var varCaracter1 = '\u0024'; // Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; // Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; // UN caracter especial, podemos copiar y pegar de unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 's';
        System.out.println("caracterChar = " + caracterChar);
    }

}
