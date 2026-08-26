// Cicllos

// While
let contador = 0;
while (contador < 3) {
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while");

// Do While
let contador2 = 0;
do{
    console.log(contador2);
    contador2++;
}while (contador2 < 3) 
console.log("Fin del ciclo do while");

// For
for (let i = 0; i < 3; i++) { // el i seria el contador  
    console.log(i); // i++ es lo mismo que i = i + 1
}
console.log("Fin del ciclo for");

// Palabra reservada break
for(let j = 1; j <= 10; j++){
    if (j % 2 == 0) {
        console.log(j); 
        break; // rompe la estructura al encontrar el primer numero par
    }
}
console.log("Fin del ciclo al encontrar el primer numero par");
// otro ejemplo
let k = 3;
while (k > -3){
    k--;
    if (k < 0) {
        console.log(k);
        break; // rompe la estructura al encontrar el primer numero negativo
    }
}
console.log("Fin del ciclo al encontrar el primer numero negativo");

// Palabra reservada continue y Etiquetas Labels
etiqueta:
for (let l = 0; l <= 10; l++){
    if (l % 2 !== 0) {
        continue etiqueta;
    }
    console.log(l); // imprime los numeros impares
}
console.log("Fin del ciclo al");