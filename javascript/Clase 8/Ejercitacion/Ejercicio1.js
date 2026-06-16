// Ejercicio 1: Calcular estaciones del año
let mes = 3, estacion;

if (mes >= 1 & mes <= 3){
    estacion = "Verano";
}
else if (mes >= 4 & mes <= 6){
    estacion = "Otoño";
}
else if (mes >= 7 & mes <= 9){
    estacion = "Invierno";
}
else if (mes >= 10 & mes <= 12){
    estacion = "Primavera";
}
else {
    estacion = "Valor incorrecto";
}
console.log("Estacion: " + estacion);