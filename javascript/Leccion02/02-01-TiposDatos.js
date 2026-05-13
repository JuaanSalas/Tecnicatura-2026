// Tipos de datos en Javascript
/* 
La sintaxis de documentacion en 
Javascript es muy similar a la de Java,
podriamos decir que es identica
*/
// Tipos de datos
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
console.log(miFuncion);

// Tipo symbol(simbolo)
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

// Tipo class(clase)
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

// Tipo undefined(indefinido)
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato pero su origen es de tipo object
console.log(typeof y);

// Tipo array y Empty String(arreglo y Empty cadena)
var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos);

var z = '';
console.log(z);
console.log(typeof z);