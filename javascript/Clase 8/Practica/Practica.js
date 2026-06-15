// Ejercicitacion: Si el padre puede asistir al juego de su hijo
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

// Ejercitacion: Numero par o impar
let num = 4;
let resultado2 = num % 2 == 0 ? "El numero es par" : "El numero es impar"
console.log(resultado2);

// Ejercitacion: Mayor de edad
let edad2 = 17;
let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar"
console.log(resultado3);

// Conversion String a Number
let miString = "21";
console.log(typeof miString);
let edad = Number(miString);
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