// Concatenacion de cadenas

var nombre = "Juan";
var apellido = " Salas";
var nombreCompleto = nombre+' '+apellido; //Primer manera de concatenar
console.log(nombreCompleto);
var nombreCompleto2 = 'Juan'+' '+'Salas'; //Segunda manera de concatenar
console.log(nombreCompleto2); 

var juntos = nombre + 219; //Lee de izquierda a derecha siguiendo la cadena lee el numero como tipo str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre; //Al leer de izquierda a derecha primero hace la suma y luego concatena todo como str
console.log(juntos);

nombre += apellido; //Concatenacion usando el operador simplificado
console.log(nombre);

// Var Let y Const

let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Suarez"; // Const no puede ser modificada
console.log(apellido2);

var x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //Se puede hacer asignaciones de las variables en una misma linea
let z = x + y; //Se asigna el valor de una operacion
console.log(z);

let _1num = 34; //No utilizar numeros al inicio del nombre de una variable, ni usar palabras reservadas del lenguaje
console.log(_1num);

// Ampliando el uso de var let y const
/*
Con var se puede reasignar en cualquier momento,
este forma parte del ambito global
Un error es que se sobreescriba
*/

var nombre = 'Juan';
nombre = 'Jose'; //Reasignacion de la variable, puede cambiar hasta el valor de la variable, ej de tipo str a numbrer 
console.log(nombre);

function saludar(){
    var nombre3 = 'Maria';
    console.log(nombre3);
}
//console.log(nombre3); //Aca no lee el dato en la funcion

if (true){
    var edad = 34;
    console.log(edad); 
}
console.log(edad); //En la funcion funciono correctamente, en la esctructura if fallo, pues al acrearse la variable dentro de la estructura no se tendriq que poder acceder, por esto es recomendable utilizar let

/*
let puede ser reasignada en cualquiqer momento,
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre4 = 'Pedro';
    console.log(nombre4);
}
//console.log(nombre4); 

if (true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
Const se utiliza par variables constantes que no pueden ser reasignadas
*/

const fechaNacimiento = '2008';
console.log(fechaNacimiento);
//fechaNacimiento = '2009';
//console.log(fechaNacimiento); //Solo se ejecuta en console anterior
