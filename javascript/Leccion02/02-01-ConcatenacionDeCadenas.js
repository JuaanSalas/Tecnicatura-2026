var nombre = "Juan";
var apellido = "Salas";
var nombreCompleto = nombre+' '+apellido; //Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Juan'+' '+'Salas'; //Segunda concatenacion
console.log(nombreCompleto2); 
var juntos = nombre + 219; //Lee de izquierda a derecha siguiendo la cadena lee el numero como tipo str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre; //Primero hace la suma y luego concatena todo como str
console.log(juntos);
nombre += apellido; //Concatenacion usando el operador simplificado
console.log(nombre);

// Let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Suarez";
console.log(apellido2);
let x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //Se puede hacer asignaciones de las variables en una misma linea
let z = x + y; //Se asigna el valor de una operacion
console.log(z);
let _1num = 34; //No utilizar numeros al inicio del nombre de una variable
console.log(_1num); // bla bla