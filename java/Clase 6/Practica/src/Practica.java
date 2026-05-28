
import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {
        /*System.out.println("Hola " + "mundo");
        // Tipos primitivos tipo booleano
        var varBool = false;
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es verde");
        } 
        else {
            System.out.println("La bandera es roja");
        }
        // Algoritmo : ¿Es mmayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        var adulto = edad >= 18; //Exprecion booleana
        if (adulto) {
            System.out.println("Es mayor de edad");
        } 
        else {
            System.out.println("Es menor de edad");
        }
        // Conversion de tipos primitivos
        //var edad = Integer.parseInt("20");
        System.out.println ("edad = " + (edad + 10));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);*/
        
        // Pedir un valor
        /*var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
//        edad = Integer.parseInt (entrada.nextLine());
//        System.out.println("Su edad es: " + edad);
        
        // Seguimos con la conversion de tipos primitivos en java
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "programadores".charAt(3);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
        
        //Clase 7
        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println(" solucion de la multiplicacion = " +  solucion);
        
        solucion = num1 / num2;
        System.out.println(" solucion de la division = " +  solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; // Guarda elo residuo entero de la solucion
        System.out.println("solucion residuo = " + solucion);
        
        // Cuando usamos una estructura if else con solo una linea de codigo en cada bloque no hace falta las llaves
        if (num1 % 2 == 0)
            System.out.println("Par");
        else 
            System.out.println("Impar");*/
        
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; //Es la simplificacion de esto: varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum1 = 2;
        varNum1 -= 1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 *= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 = 4;
        varNum2 /= 2;
        System.out.println("varNum2 = " + varNum2);
        
        var varNum4 = 8;
        varNum4 %= 2;
        System.out.println("varNum4 = " + varNum4);
        
        //Operadores Unarios: Cambio de signo
        /*var varA = 7;
        var varb = - varA;
        System.out.println("varA = " + varA);
        System.out.println("varb = " + varb);
        
        //Operador de Negacion
        var varC = true; //Esta literal por default en java es de tipo boolean
        var varD = !varC; //Se invierte el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: Preincremento
        var varE = 9;
        var varF = ++varE; //El simbolo va antes de la variable
        //Primero se incrementa la variable y despues sse usa su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        //Postincremento (simbolo despues de la variable)
        var varG = 4;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de Decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variable ya esta con el decremento
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("varL = " + varL);*/
        
        //Operadores de Igualdad y Relacionales
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hola";
        var cadenaB = "chau";
        var cVar = cadenaA == cadenaB; //No es la manera correcta, pues no comprara el contenido en si de las variables
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB); //Metodo correcto para comparar el contenido de dos vaiables de tipo str
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum > bNum;
        System.out.println("gVar = " + gVar); // > >= < <= == !=
        
        if (aNum % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El nunmero es impar");
        }
        var edad = 30;
        var mayor = 18;
        if (edad >= mayor){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");*/
        
        /*var valorA = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("Dentro del rango establecido");
        }
        else {
            System.out.println("Fuera del rango establecido");
        }
        
        var vacaciones = true;
        var diaLibre = false;
        if (vacaciones || diaLibre){
            System.out.println("Puede asistir al partido");
        }
        else {
            System.out.println("No puede asistir al partido");
        }*/
        
        // Operador Ternario
        /*var resultadoT = (5 > 4) ? "Verdadero": "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 8;
        resultadoT = (numeroT % 2 == 0) ? "Par": "Impar";
        System.out.println("resultadoT = " + resultadoT);*/
        /*var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);*/
        }
    }
    

