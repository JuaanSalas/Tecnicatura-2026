# Ejercicio 13:Determinar la solucion logica de la siguiente operacion:
# (3+5*8) < 3 and ((- 6/3 * 4) + 2 < 2) or (a > b)
a = int(input("Digite el valor de a: "))
b = int(input("Digite el valor de b: "))
resultado = (3 + 5 * 8) < 3 and ((- 6/3 * 4)+ 2 < 2) or (a > b)
print(f"El resultado es: ",resultado)