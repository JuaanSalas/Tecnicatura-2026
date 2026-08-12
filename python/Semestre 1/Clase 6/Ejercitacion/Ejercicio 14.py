# Ejercicio 14: Programa para intercambiar el valor de dos variables
a = int(input("Digite el valor de a: "))
b = int(input("Digite el valor de b: "))
aux = a
a = b
b = aux
print(f"El nuevo valor de a es: ",a)
print(f"El nuevo valor de b es: ",b)