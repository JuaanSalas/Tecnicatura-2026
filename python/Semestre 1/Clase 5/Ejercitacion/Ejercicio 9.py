# Ejercicio 9: Identificar el mayor de dos numeros
num1 = int(input("Digite el primer numero:"))
num2 = int(input("Digite el segundo numero:"))
if num1 > num2:
    print(f"El primer numero, {num1}, es mayor al segundo, {num2}")
elif num1 == num2:
    print(f"Los dos numeros son iguales")
else:
    print(f"El segundo numero, {num2}, es mayor al primero, {num1}")