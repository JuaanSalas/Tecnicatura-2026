# Ejercicio 11: Conversion de numero a texto
num = int(input("Digite un numero del 1 al 3: "))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else :
    numTexto = "Numero fuera del rango"
print(f"Numero ingresado: {num} - {numTexto}")
