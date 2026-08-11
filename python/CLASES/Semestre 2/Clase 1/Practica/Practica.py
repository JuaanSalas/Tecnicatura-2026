# Listas

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


# Tuplas

# Definir tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(len(cocina))

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

# Eliminar tupla
# del cocina