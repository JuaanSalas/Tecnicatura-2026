'''
# Ejercicio 1:
# Escribir la siguiente exprecion en forma de expresion algortimica: a3 x (b2-2ac)/2b
a = float(input("Digite el valor de a: "))
b = float(input("Digite el valor de b: "))
c = float(input("Digite el valor de c: "))
resultado = (a**3*(b**2-2*a*c))/(2*b)
print(f"El resultado es: ",resultado)
'''

'''
# Ejercicio 2:
# Determinar la solucion logica de la siguiente operacion: (3+5*8) < 3 and ((- 6/3 * 4) + 2 < 2) or (a > b)
a = int(input("Digite el valor de a: "))
b = int(input("Digite el valor de b: "))
resultado = (3 + 5 * 8) < 3 and ((- 6/3 * 4)+ 2 < 2) or (a > b)
print(f"El resultado es: ",resultado)
'''
'''
# Ejercicio 3:
# Intercambiar el valor de dos variables
a = int(input("Digite el valor de a: "))
b = int(input("Digite el valor de b: "))
aux = a
a = b
b = aux
print(f"El nuevo valor de a es: ",a)
print(f"El nuevo valor de b es: ",b)
'''

'''
Ejercicio 4: Area y longitud de un circulo
Hacer un programa para ingresar el raio de un circulo y se reporte su area y la longitud de la circunferencia
Area = Pi * r2
Longitud = 2 * pi * r
'''
r = float(input("Digite el valor del radio del circulo: "))
import math
area = math.pi * r ** 2
longitud = 2 * math.pi * r
print(f"El valor del area es: ",area)
print(f"El valor de la longitud es: ",longitud)