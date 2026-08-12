# Ejercicio 26: Ingresar "N" numeros, visualizar la suma de los pares, la cantidad de
# pares, y el promedio de los impares
rango = int(input("Digite un rango: "))
sumaPares = 0
cantPares = 0
sumaImpares = 0
cantImpares = 0
promedioImp = 0
i = 0
for i in range(rango):
    num = int(input("Digite un numero: "))
    if num % 2 == 0:
        sumaPares += num
        cantPares += 1
    else :
        sumaImpares += num
        cantImpares += 1
        promedioImp = sumaImpares / cantImpares
    i += 1
print("La suma de los pares es: ",sumaPares)
print("La cantidad de numeros pares: ",cantPares)
print("El promedio de los numeros impares es: ",promedioImp)