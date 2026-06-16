// Ejercitacion: Sistema de calificaciones

let nota = 9;

if (nota == 9 || nota == 10){
    console.log("Calificacion: A");
}
else if(nota == 8 && nota < 9){
    console.log("Calificacion: B");
}
else if(nota == 7 && nota < 8){
    console.log("Calificacion: C");
}
else if(nota == 6 && nota < 7){
    console.log("Calificacion: D");
}
else if (nota >= 0 && nota < 6){
    console.log("Calificacion: F");
}
else {
    console.log("Nota no valida")
}