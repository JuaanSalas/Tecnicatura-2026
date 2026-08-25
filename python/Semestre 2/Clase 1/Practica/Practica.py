# Clase 1

# Colecciones en Python

# Listas
# En otros lenguages las listas se connoces como arreglos o vectores
nombres = ["jose", "pedro", "juan", "ana"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[-1])

print(nombres[0:2]) # Muestra el indice 0, 1 pero no el 2

# Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) # muestra los indices 0, 1, 2

# Desde el indice indicado hasta el final
print(nombres[2: ])

# Modificar valores
nombres[2] = ("flaco")
nombres[0] = ("josesito")
print(nombres)

# Iterar una lista
for nombre in nombres:
    print(nombre)
else: 
    print("Elementos de la lista acabados")

# Mostrar cantidad de elementos de una lista
print(len(nombres)) # como parametro pasamos la variable de nuestra lista

# Agregar un elemento a la lista
nombres.append("flavio")
nombres.append([1, 2, 3, 4])
nombres.append(True)
nombres.append(10.15)
nombres.append(8)
print(nombres)

# Insertar elemento en un indice especifico
nombres.insert(1, "guille")
nombres.insert(3, "santi")
print(nombres)

# Eliminar un elemento
nombres.remove("guille")
print(nombres)

# Eliminar elemento en la ultima posicion de la lista
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2]
print(nombres)

# Limpiar la lista
nombres.clear()
print(nombres)

# Eliminar lista
del nombres
# print(nombres) # da eror pues la lista fue eliminada en al linea 57

# Concatenar listas
lista1 = [1, 2, 2]
lista2 = [4, 5, 6]
lista3 = lista1 + lista2
print("Lista concatenada: ", lista3)

# Agregar varios elementos a una lista
lista3.extend([7, 8, 9])
print(lista3)

# Funcion para saber en que indice esta un elemento
print(lista3.index(5))

# Funcion para saber cuantos valores estan repetidos en una lista
print(lista3.count(2))

# Funcion para poner una lista al revez
lista3.reverse()
print(lista3)

# Funcion para que una lista se multiplique repitiendo sus elementos
lista3 *= 2
print(lista3)

# Metodos de ordenamiento:

# Ascendente
lista3.sort()
print(lista3)

# Descendente
lista3.sort(reverse=True)
print(lista3)

# Tuplas

# Definir tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print("\n", len(cocina))

# Acceder a un elemento
print(cocina[0])
print(cocina[-1]) # ultimo elemento

# Acceder a un rango
print(cocina[0:2])

# Nota: una tupla, aunque sea de un solo elemento siempre necesita una coma, de lo contrario seria una cadena
verduras = ("papa") #Cadena
verduras1 = ("papas",) #Tupla

# Recorrer elementos de una tupla
for cocinar in cocina:
    print(cocinar, end=" ") # Para mostrar elementos de una tupla y que se impriman en una sola linea utilizamos: end=""

# NOTA: Las tuplas en si son inmutables, no se pueden modificar. En cualquier caso que sea necesario modificarla este es el procedimiento
# de conversion a realizarse, sin embargo no es una buena practia
cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print("\n", cocina) # "\n" sirve para anular end=""

# Eliminar tupla:
# del cocina

tupla = (4, "hola", 10.45,[1, 7, 3], True, 4, "tupla") # Las tuplas pueden contener distintos tipos de datos
print(tupla)

print(4 in tupla) # Verificar si un elemento existe dentro de una tupla

# Funciones que pueden utilizarse dentro de las tuplas: index, count, len
print(tupla.index("hola"))
print(tupla.count(4))
print(len(tupla))
# Se puede hacer la conversion de tuplas a lista y viceversa
listaN = tuple(tupla) # De tupla a lista
print("Lista: ", listaN)
tupla = tuple(listaN) # De lista a tupla
print("Tupla: ", tupla)