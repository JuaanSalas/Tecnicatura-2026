// Tipo string(cadena)
var nombre = "Juan"; 
console.log(nombre);
nombre = 7;
console.log(nombre);
nombre = 12.3;
console.log(nombre);

// Tipo number(numerico)
var numero = 3000;
console.log(numero);

// Tipo objet(objeto)
var objeto = {
    nomre: "Juan",
    apellido: "Salas",
    telefono: "2604098844"
}
console.log(objeto);

// Tipo boolean(booleano)
var bandera = true;
console.log(bandera);

// Tipo function(funcion)
function miFuncion(){}
console.log(typeof miFuncion);

// Tipo symbol(simbolo)
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

// Tipo class (clase /es de tipo function)
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);

// Tipo undefined(indefinido)
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato pero su origen es de tipo object
console.log(y);

// Tipo Array (arreglo) y Empty String (cadena vacia)
var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos);

var z = ''; // Es una cadena vacia
console.log(z);
console.log(typeof z); // No es un tipo de dato en si mismo pero su origen es de tipo string