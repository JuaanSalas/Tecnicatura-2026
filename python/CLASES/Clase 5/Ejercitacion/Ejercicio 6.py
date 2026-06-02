# Ejercicio 6: Valor dentro de un rango
valor = int(input("Digite un numero dentro del rango 0-5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El numero {valor}, esta dentro del rango")
else:
    print(f"El numero {valor}, no esta dentro del rango")