# Ejercicio 24: Programa par calcular la calificacion promedio y la calificacion
# mas baja de 10 notas
i = 0
suma = 0
notaBaja = 100000
for i in range(10):
    notas = int(input("Digite una nota: "))
    suma += notas
    if notas < notaBaja:
        notaBaja = notas
promedio = suma / 10
print("La calificacion promedio es :", promedio)
print("La calificacion mas baja es: ", notaBaja)
