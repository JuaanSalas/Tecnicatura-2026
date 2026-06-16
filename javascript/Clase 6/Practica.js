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