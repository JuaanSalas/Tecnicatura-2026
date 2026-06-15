// Ejercicio 1: Calcular estaciones del año
let mes = 3;
let estacion;
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

// Ejercicio 2: Hora del dia (formato 24hs)

let hora = 22;
let actividad;
if (hora == 8){
    actividad = "Desayunando";
}
else if (hora >= 9 & hora <= 12){
    actividad = "Estudiando";
}
else if (hora == 13){
    actividad = "Almorzando";
}
else if (hora >= 14 & hora <= 16){
    actividad = "Durmiendo siesta";
}
else if (hora == 17){
    actividad = "Merenando";
}
else if (hora >= 18 & hora <= 21){
    actividad = "Estudiando";
}
else if (hora > 21 & hora <= 23){
    actividad = "Entrenando";
}
else if (hora >= 0 & hora <= 7){
    actividad = "Durmiendo";
}
else {
    actividad = "Hora no valida"
}
console.log("Actividad: " + actividad)

// Ejercicio 3: Estaciones del año con switch
mes = 6
switch (mes){
    case 12: case 1: case 2:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log(estacion);