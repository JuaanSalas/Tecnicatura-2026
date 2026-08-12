# Ejercicio 16: Estaciones del año
mes = int(input("Ingrese un mes del año: "))
if mes >= 1 and mes <= 3:
    print("Estacion: Verano")
elif mes >= 4 and mes <= 6 :
    print("Estacion: Otoño")
elif mes >= 7 and mes <= 9:
    print("Estacion: Invierno")
elif mes >= 10 and mes <= 12:
    print("Estacion: Primavera")
else:
    print("Mes incorrecto")