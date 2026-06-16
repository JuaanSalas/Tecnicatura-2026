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

// Clase 4
// Tipo class (clase /es de tipo function)
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);