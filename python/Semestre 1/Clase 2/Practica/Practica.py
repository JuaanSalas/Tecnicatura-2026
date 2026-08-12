# Variables en Python

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