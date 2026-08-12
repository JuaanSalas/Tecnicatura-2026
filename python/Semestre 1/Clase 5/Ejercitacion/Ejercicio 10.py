# Ejercicio 10: Tienda de libros
print("Digite los siguientes datos del libro: ")
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el loibro es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, dibe digitar True/False"
print(f"""
        Nombre = {nombre}
        ID = {id}
        Precio = {precio}
        Envio gratuito? = {envioGratuito}
""")