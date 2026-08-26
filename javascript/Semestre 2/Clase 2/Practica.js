// Arrays / Arreglos

// Esta es la sintaxis vieja
let autos2 = new Array("BMW", "Audi", "Ford");

// Sintaxis actual
const autos = ["BMW", "Audi", "Ford"];
console.log(autos);

// Recorrer elementos de un arreglo

// Podemos acceder a un elemento del arreglo mediante su índice
console.log(autos[0]);
console.log(autos[2]);

// Podemos recorrer un arreglo con un ciclo for
for (let i = 0; i < autos.length; i++) {
    console.log(i + " : " + autos[i]);
}

// Tambien podemos recorrer el arreglo con la siguiente funcion
autos.forEach(function(auto) {
    console.log(auto);
})

// Modificar elementos de un arreglo

// Por indice
autos[2] = "Chevrolet";
console.log(autos);

// Agregar un elemento al final
autos.push("Volskvawen");
console.log(autos);
// Otra forma
autos[autos.length] = "Peugeot";
console.log(autos);

// Esta forma saltea indices, puede dejar espacios de memoria vacios que pordiran dañar el programa
//autos[6] = "Renault";
//console.log(autos);

// Agregar un elemento al principio
autos.unshift("Fiat")
console.log(autos);

// Verificar si es un array(arreglo) o no

// Funcion "Array.isArray"
console.log(Array.isArray(autos)); // devuelve tipo bool
// Funcion "instanceof Array"
console.log(autos instanceof Array);