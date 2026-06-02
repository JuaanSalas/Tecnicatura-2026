# Ejercicio 23: Leer 20 numeros e identificar cuantos son positivos, cuantos son negativos
# y cuantos son neutros
positivos = 0
negativos = 0
neutros = 0
for i in range(20):
    numeros = int(input("Digite un numero: "))
    if numeros > 0:
        positivos += 1
    elif numeros < 0:
        negativos += 1
    else :
        neutros += 1
print("La cantidad de numeros positivos es:", positivos)
print("La cantidad de numeros negativos es:", negativos)
print("La cantidad de numeros neutros es:", neutros)