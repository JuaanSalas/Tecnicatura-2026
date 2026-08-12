# Ejercicio 17: Etapas de vida
edad = int(input("Ingrese su edad: "))
if edad >= 0 and edad <= 10:
    print("La infancia es increible")
elif edad > 10 and edad <= 19:
    print("Muchos cambios, mucho que estudiar")
elif edad >= 20 and edad <= 29:
    print("Amor y comienza el trabajo")
elif edad >= 30 and edad <= 39:
    print("Estas cumpliendo todas tus metas")
elif edad >= 40 and edad <= 49:
    print("La experiencia te hace mas fuerte y sabio")
elif edad >= 50 and edad <= 59:
    print("Disfruta de tus logros y de la vida")
elif edad >= 60 and edad <= 69:
    print("Tiempo de familia y tranquilidad")
elif edad >= 70 and edad <= 79:
    print("Muchas historias que contar, muchos consjos que repartir")
elif edad >= 80 and edad <= 120:
    print("Dejas huellas inolvidables")
else :
    print("Edad no valida")