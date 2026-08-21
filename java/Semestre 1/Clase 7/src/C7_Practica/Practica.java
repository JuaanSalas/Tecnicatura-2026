package C7_Practica;

public class Practica {
    public static void main(String[] args) {
        /*
        // Operadores Aritmeticos
        
        //var num1 = 5, num2 = 4; Con la inferencia de tipos no se pueden inicializar mas de una variable
        int num1 = 5, num2 = 4; // Forma correcta
        var solucion = num1 + num2;
        System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; // Guarda el residuo entero de la division
        System.out.println("solucion modulo = " + solucion);
        
        if (num1 % 2 == 0)
            System.out.println("Numero par");
        else
            System.out.println("Numero impar");
        
        int varNum1 = 2, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);
        
        // Operadores de Asignacion
        // +=   -=  *=  /=  %=
        
        varNum1 += 1; // varNum1 = varNum1 + 1
        System.out.println("varNum1 = " + varNum1);
        varNum3 -= 2;
        System.out.println("varNum3 = " + varNum3);
        varNum3 *= 3;
        System.out.println("varNum3 = " + varNum3);
        varNum2 /= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum2 %= 2;
        System.out.println("varNum2 = " + varNum2);
        
        // Operadores Unarios: cambio de signos
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        // Operador de negacion
        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        // Operadores Unarios de Incremento: Preincremento
        var varE = 9;
        var varF = ++varE; //Simbolo despues de la variable
        // Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);//Se incrementa en la unidad
        System.out.println("varF = " + varF);//Va a sumar uno
        
        // Postincremento
        var varG = 3;
        var varH = varG++;//Primero el valor de la variable luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        // Postdecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        */
        /*
        // Operadores de Igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);// == si son iguales
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;// !== si son diferentes
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB; //Compara la referencia
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB); //Compara el contenido
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum != bNum; // <, <=, >, >=, ==, !=,
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0)
            System.out.println("Numero par");
        else
            System.out.println("Numero impar");
        
        var edad = 30;
        if (edad >= 18)
            System.out.println("Mayor de edad");
        else 
            System.out.println("Menor de edad");
        */
        
        // Operadores Condicionales
        
        var valorA = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= valorMinimo & valorA <= valorMaximo;// Operador and: &
        if (respuesta){
            System.out.println("Dentro del rango establecido");
        } else {
            System.out.println("Fuera del rango establecido");
        }
        
        var vacaciones = false; 
        var diaLibre = true;
        if (vacaciones || diaLibre){// Operador or: ||
            System.out.println("Puede asistir al juego");
        } else {
            System.out.println("No puede asistir al juego");
        }
        
        // Operador Ternario
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso"; //Sintaxis del operador Ternario
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 9;
        resultadoT = (numeroT % 2 == 0) ? "Par" : "Impar";
        System.out.println("resultadoT = " + resultadoT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
    }
    
}
