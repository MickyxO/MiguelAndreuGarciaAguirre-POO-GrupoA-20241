from Book import Book #importas la clase libro
from User import User
from Library import Library

library = Library() #creas una instancia

print("BIENVENIDO A LA LIBRERIA")
while True:
    print("\nQue acción desea realizar?\n " +
          "1. Añadir un nuevo libro. \n" +
          "2. Añadir un nuevo usuario. \n" +
          "3. Como usuario, rentar un libro. \n" +
          "4. Como usuario, comprar un libro. \n" +
          "5. Mostrar todos los libros. \n" +
          "6. Mostrar todos los usuarios. \n" +
          "7. Mostrar todos los libros que estan en renta. \n"+
          "8. Mostrar todos los libros que no estan en renta. \n"+
          "9. Como usuario, mostrar toda mi informacion. \n"+
          "10. Mostrar todos los usuarios que han hecho compras. \n"+
          "11. Mostrar todos los usuarios con rentas activas. \n" +
          "12. Mostrar la informacion de un libro. \n" +
          "13. Como usuario, regresar un libro rentado. \n"+
          "E= EXIT \n")
    option = input("Selecciona tu opcion: ")
    if option=='1':
        name= input("Añade el titulo de tu libro: ")
        autor= input("Cuál es el autor?: ")
        precio= input("Cual es el precio deseado: ")
        library.agregar_libro(Book(name,autor,precio))
        print("Libro agregado.")
    elif option=='2':
        name1= input("Cual es el nombre y apellido de tu usuario. ")
        age= int(input("Cual es la edad del usuario: "))
        library.agregar_usuario(User(name1,age))
        print("Usuario agregado.")
    elif option=='3':
        name3= input("Cual es el nombre completo de tu usuario: ")
        band= library.bool_buscar_user(name3)
        if band:
            user= library.buscar_user(name3)
            print("Los libros disponibles para renta son: ")
            library.mostrar_libros_NO_rentados()
            title=input("Que libro deseas?: ")
            user.rentar_libro(title)
        else:
            print("Usuario no existente.")
    elif option=='4':
        name4 = input("Cual es el nombre completo de tu usuario: ")
        band = library.bool_buscar_user(name4)
        if band:
            user = library.buscar_user(name4)
            print("Los libros disponibles para compra son: ")
            library.mostrar_libros_NO_rentados()
            title = input("Que libro deseas comprar?: ")
            user.comprar_libro(title)
        else:
            print("Usuario no existente.")
    elif option=='5':
        library.mostrar_libros()
    elif option=='6':
        library.mostrar_usuarios()
    elif option=='7':
        library.mostrar_libros_rentados()
    elif option=='8':
        library.mostrar_libros_NO_rentados()
    elif option=='9':
        name5 = input("Cual es el nombre completo de tu usuario: ")
        band = library.bool_buscar_user(name5)
        if band:
            library.mostrar_full_user(name5)
        else:
            print("USUARIO NO EXISTENTE")
    elif option=='10':
        library.mostrar_usuarios_compra()
    elif option=='11':
        library.mostrar_usuarios_renta()
    elif option=='12':
        print("Los libros en existencia son: ")
        library.mostrar_libros()
        title= input("Ingresa el titulo del libro a revisar: ")
        band= library.bool_buscar_libro(title)
        if band:
            book= library.buscar_libro(title)
            print("El titulo del libro es {}, su autor es {} y su precio es {}.".format(book.get_nombre(),book.get_autor(),book.get_precio()))
    elif option=='13':
        name5 = input("Cual es el nombre completo de tu usuario: ")
        band = library.bool_buscar_user(name5)
        if band:
            user = library.buscar_user(name5)
            user.mostrar_libros_rentados()
            ret=input("Que libro deseas regresar? ")
            user.desrentar_libro(ret)
        else:
            print("USUARIO NO EXISTENTE! ")
    elif option=='E':
        break
    else:
        print("Opcion no valida, por favor selecciona otra opcion.")




