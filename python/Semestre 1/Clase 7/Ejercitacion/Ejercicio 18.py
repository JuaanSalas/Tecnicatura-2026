# Ejercicio 18: Sistema de calificaciones
nota = int(input("Ingrese su nota: "))
if nota == 9 or nota == 10:
    print("Su calificaion es: A")
elif nota == 8 and nota < 9:
    print("Su calificacion es: B")
elif nota == 7 and nota < 8:
    print("Su califcaicion es: C")
elif nota == 6 and nota < 7:
    print("Su calificacion es: D")
elif nota >= 0 and nota < 6:
    print("Su calificacion es: F")
else:
     print("Nota no valida")
