// Ejercicio 2: Hora del dia (formato 24hs)
let hora = 22, actividad;

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