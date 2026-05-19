'''
# Ejercicio 1: Valor de un rango
valor = int(input("Digite un numero dentro del rango 0-5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El numero {valor}, esta dentro del rango")
else:
    print(f"El numero {valor}, no esta dentro del rango")
'''
'''
# Ejercicio 2: Operador or, not
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print(f"Tiene trabajo que hacer")
else:
    print(f"Puede acceder al juego")
'''
'''
# Ejercicio 3:Rango entre edades (20-30 años)
edad = int(input("Digite su edad: "))
if edad >= 20 and edad <= 30:
    print(f"Su edad, {edad}, esta dentro del rango 20' y 30' añios")
else:
    print(f"Su edad, {edad}, no esta dentro del rango de los 20' y 30' añios")
'''
'''
# Ejercicio 4: Identificar el mayor de dos numeros
num1 = int(input("Digite el primer numero:"))
num2 = int(input("Digite el segundo numero:"))
if num1 > num2:
    print(f"El primer numero, {num1}, es mayor al segundo, {num2}")
elif num1 == num2:
    print(f"Los dos numeros son iguales")
else:
    print(f"El segundo numero, {num2}, es mayor al primero, {num1}")
'''
# Ejercicio 5: Tienda de libros
print("Digite los siguientes datos del libro: ")
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el loibro es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, dibe digitar True/False"
print(f"""
        Nombre = {nombre}
        ID = {id}
        Precio = {precio}
        Envio gratuito? = {envioGratuito}
""")