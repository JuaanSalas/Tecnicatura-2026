# Ejercicio 21: Programa que, al ingresar un año, nos devuelva si es bisiesto o no,
# repetir el programa hasta que el usuario lo decida
while True:
    anio = int(input("Nota: Para finalizar el programa digite 0 \nIngrese un año: "))
    if anio == 0:
        print("Programa finalizado")
        break
    elif anio % 4 == 0 and anio % 100 != 0 or anio % 400 == 0:
        print("El año es bisiesto:", anio)
    else :
        print("El año no es bisiesto:", anio)