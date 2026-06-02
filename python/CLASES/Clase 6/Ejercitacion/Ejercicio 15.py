# Ejercicio 4: Hacer un programa que al ingresar el raio de un circulo se reporte su area y la longitud de la circunferencia
# Area = Pi * r2
# Longitud = 2 * pi * r
r = float(input("Digite el valor del radio del circulo: "))
import math
area = math.pi * r ** 2
longitud = 2 * math.pi * r
print(f"El valor del area es: ",area)
print(f"El valor de la longitud es: ",longitud)