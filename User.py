import random
from Library import Library
class User:
    __id=0
    __nombre = ""
    __edad = 0
    library = Library()



    def __init__ (self, _nombre,_edad): #metodo constructor,  el self es el this en java
      self.__id = random.randint(1,1000)
      self.__nombre = _nombre
      self.__edad = _edad
      self.__libros_rentados=[] #que sea individual para cada user
      self.___libros_comprados=[]

    def rentar_libro(self, nombre):
        if self.library.bool_buscar_libro(nombre):
            book = self.library.buscar_libro(nombre)
            if book.get_rentado() == True:
                print("EL LIBRO ESTA RENTADO, NO DISPONIBLE")
            else:
                book.set_rentado()
                self.__libros_rentados.append(book)
                print("Libro rentado")
        else:
            print("LIBRO NO EXISTENTE")

    def desrentar_libro(self, nombre):
        if self.library.bool_buscar_libro(nombre):
            book = self.library.buscar_libro(nombre)
            if book.get_rentado():
                for libro in self.__libros_rentados:
                    if nombre.lower() == libro.get_nombre().lower():
                        book.set_unrentado()
                        print("LIBRO DEVUELTO. ")
            else:
                print("EL LIBRO NO ESTA RENTADO! ")
        else:
            print("LIBRO NO EXISTENTE! ")

    def comprar_libro(self,nombre):
        if self.library.bool_buscar_libro(nombre):
            book = self.library.buscar_libro(nombre)
            self.___libros_comprados.append(book)
            self.library.eliminar_libro(nombre)
            print("LIBRO COMPRADO, DISFRUTA TU COMPRA")
        else:
            print("LIBRO NO EXISTENTE")


    def mostrar_libros_rentados(self):
        for libro in self.__libros_rentados:
            print("\n--LIBROS RENTADOS--\n"
                  "{} por el autor {}\n".format(libro.get_nombre(),libro.get_autor()))

    def mostrar_libros_comprados(self):
        for libro in self.___libros_comprados:
            print("\n--LIBROS COMPRADOS--\n"
                  "{} por el autor {}\n".format(libro.get_nombre(), libro.get_autor()))

    def get_len_comprados(self):
        return len(self.___libros_comprados)

    def get_len_rentados(self):
        return len(self.__libros_rentados)

    def get_nombre(self):
        return self.__nombre

    def get_edad(self):
        return self.__edad

    def get_id(self):
        return self.__id