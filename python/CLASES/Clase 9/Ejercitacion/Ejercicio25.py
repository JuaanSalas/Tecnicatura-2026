# Ejercicio 25: Calcular el factorial de un numero mayor o igual a 0
print("Digite un numero mayor a 0: ")
num = int(input())
resultado = 1
contador = 1
if num >= 0:
    while contador <= num:
        resultado *= contador
        contador += 1
else:
    print("El numero no es mayor a 0")
print(f"El fatorial de {num} es: {resultado}")