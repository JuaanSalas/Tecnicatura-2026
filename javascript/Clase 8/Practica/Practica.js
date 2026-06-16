// Operadores Logicos and (&&) y or (||)

// Ejercicitacion de Practica: Si el padre puede asistir al juego de su hijo
let vacaciones = true, diaLibre = false;
if (vacaciones == true || diaLibre == true){
    console.log("Puede asistir al juego del hijo")
}
else {
    console.log("No puede asistir al juego")
}

// Operador Ternario
let resultado = 4 < 8 ? "Verdadero" : "Falso"
console.log(resultado);

// Ejercitacion de Practica: Numero par o impar
let num = 4;
let resultado2 = num % 2 == 0 ? "El numero es par" : "El numero es impar"
console.log(resultado2);

// Ejercitacion de Practica: Mayor de edad
let edad2 = 17;
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar"
console.log(resultado3);

// Conversion String a Number
let miString = "21x"; //Si contiene una letra ocurre un error, para esto se utiliza la funcion isNaN (is not a number)
console.log(typeof miString);
let edad = Number(miString); //Esto es una funcion que convierte un string a numero
console.log(typeof edad);

// Funcion IsNaN (is not a number)
if (isNaN(edad)){ // Devuelve valor  booleano
    console.log("La variable no contiene solo numeros")
}
else {
    if (edad >= 18){
        console.log("Puede votar")
    }
    else {
        console.log("Muy joven para votar")
    }
}