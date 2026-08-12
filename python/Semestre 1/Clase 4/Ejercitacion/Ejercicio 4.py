# Ejercicio 4: Programa para saber si un numero es par o impar
numero = int(input("Digite un numero: "))
print(f"El residuo del numero es: {numero % 2}")
if numero % 2 == 0:
    print(f"El numero {numero} es PAR")
else:
    print(f"El numero {numero} es IMPAR")