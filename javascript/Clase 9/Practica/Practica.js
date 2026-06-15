// Evitar repetir un codigo
// Dry don't repeat yoursefl

// Version no recomendada
let days = 3;
switch (days){
    case 1:
        days = "Lunes";
        break;
    case 2:
        days = "Martes";
        break;
    case 3:
        days = "Miercoles";
        break;
    case 4: 
        days = "Jueves";
        break;
    case 5:
        days = "Viernes";
        break;
    case 6:
        days = "Sabado";
        break;
    case 7:
        days = "Domingo";
        break;
    default:
        days = "Numero no valido";
        break;
}
console.log(days);

// Version mejorada
let days2 = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];

function getDay(n){
    if (n < 1 || n > 7){
        throw new Error("Out of range");
    }
    return days2[n-1];
}
console.log(getDay(6));