from operator import concat
''''
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
#Referencia de memoria:
print(id(x))
#Las literales se escriben:x = x072, la variable y = x816, z = x136
#Cambian cada vez que ejecutamos el programa nuevamente, ya que python es un programa volatil
print(id(y))
print(id(z))

# Tipo int, Float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "Los Palmeras"
caracteriscica = "cantantes de cumbia"
print("Mi grupo favorito es:", miGrupoFavorito, caracteriscica)

num1 = "7"
num2 = "8"
print(int(num1) + int(num2))

# Tipos Booleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es Verdadero")
else:
    print("El resultado es Falso")

# Procesar la entrada del usuario
# Funcion input
resultado = input("Digite un numero ")  # "input" regresa un dato de tipo string (cadena)
print(resultado)

# Conversion de la entrada de datos input
numero1 = input("Escribe el primer numero: ")
numero2 = input("Escribe el segundo numero: ")
resultado = (int(numero1) + int(numero2))
print("El resultado de la suma es: ", resultado)
'''
'''
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("El resultado de la suma es: ", suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoA - operandoB
print(f'El resultado de la resta es: {resta}')

multipicacion = operandoA * operandoB
print(f'El resultado de la multiplicacion es: {multipicacion}')

division = operandoA / operandoB
print(f'El resultado de la division es: {division}')
division = operandoA // operandoB
print(f'El resultado de la division es: {division}')

modulo = operandoA % operandoB
print(f'El resultado de la division o residuo (modulo) es: {modulo}')

exponente = operandoA ** operandoB
print(f'El resultado de la exponente es: {exponente}')
'''

'''
alto = int(input("Proporciopne el alto del rectangulo: "))
ancho = int(input("Proporcionne el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ",area)
print("Perimetro: ",perimetro)
'''

'''
miVariabble3 = 10
print(miVariabble3)

# Operadores de reasignacion
miVariabble3 = miVariabble3 + 1
print(miVariabble3)

miVariabble3 += 1
print(miVariabble3)

# miVariabble3 = miVariable - 2
miVariabble3 -= 2
print(miVariabble3)

# miVariabble3 = miVariable - 2
miVariabble3 *= 3
print(miVariabble3)

# miVariabble3 = miVariable / 2
miVariabble3 /= 2
print(miVariabble3)

# Operadores de comparacion
# Operador igual
d = 4
b = 2
resultado = d == b # Comprobamos si son ioguales
print(resultado)

# Operador distinto
resultado = d != b
print(resultado)

# Operador mayor que
resultado = d > b
print(resultado)

# Operador menor que
resultado = d < b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print(resultado)

# Operador nayor o igual que
resultado = d >= b
print(resultado)
'''
'''
# Ejercicio para saber si un numero es par o impar
numero = int(input("Digite un numero: "))
print(f"El residuo del numero es: {numero % 2}")
if numero % 2 == 0:
    print(f"El numero {numero} es PAR")
else:
    print(f"El numero {numero} es IMPAR")
'''

# Ejercicio para saber si alguien es mayor o menor de edad
mayorEdad = 18
edad = int(input("Digite su edad: "))
if edad >= mayorEdad:
    print(f"Es mayor de edad: {edad}")
else:
    print(f"Es menor de edad: {edad}")