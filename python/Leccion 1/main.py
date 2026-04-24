from operator import concat

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
