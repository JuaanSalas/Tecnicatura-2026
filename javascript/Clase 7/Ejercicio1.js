// Ejercitacion: Sistema de calificaciones
const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question("Ingresa una nota del 0 al 10: ", function(nota) {
nota = parseInt(nota);
if (nota == 9 || nota == 10){
    console.log("A");
}
else if(nota == 8 && nota < 9){
    console.log("B");
}
else if(nota == 7 && nota < 8){
    console.log("C");
}
else if(nota == 6 && nota < 7){
    console.log("D")
}
else if (nota >= 0 && nota < 6){
    console.log("D");
}
else {
    console.log("Nota no valida")
}
    rl.close();
});