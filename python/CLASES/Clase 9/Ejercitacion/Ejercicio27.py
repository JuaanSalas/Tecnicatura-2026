# Ejercicio 27: Dadas las horas trabajadas de cinco personas y la tarifa de pago. Calcular el salario
# y la sumatoria de todos los salarios
i = 1
suma = 0
for i in range(5):
    i += 1
    print(f"Empleado {i}: ")
    horas = int(input("Ingrese las horas trabajadas: "))
    tarifa = int(input("Ingrese el tarifa por hora: "))
    salario = horas * tarifa
    print(f"Salario del empleado {i}: ${salario}")
    suma += salario
print(f"La suma de los salario es: ${suma}")