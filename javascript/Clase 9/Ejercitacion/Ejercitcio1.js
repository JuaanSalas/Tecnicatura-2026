// Ejercicio 1: Meses del año con switch, simplificar y agregar eficacia con el concepto:
// Dry don't repeat yourself

// Con switch
let month = 10;
switch (month){
    case 1:
        month = "January";
        break
    case 2:
        month = "February"
        break
    case 3:
        month = "March";
        break
    case 4:
        month = "April";
        break
    case 5:
        month = "May";
        break
    case 6 :
        month = "June";
        break
    case 7:
        month = "July";
        break
    case 8:
        month = "August";
        break
    case 9:
        month = "September";
        break
    case 10:
        month = "October";
        break
    case 11: 
        month = "November";
        break
    case 12:
        month = "December";
        break
    default:
        month = "Invalid month number";
}
console.log(month)

// Con function, simplificado
let month2 = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

function getMonth(n){
    if (n < 1 || n > 12){
        throw new Error("Out of range");
    }
    return month2[n-1];
}
console.log(getMonth(5));