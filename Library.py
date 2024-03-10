
class Library:
    __usuarios = []
    __libros = []


    def agregar_usuario(self,User):
        self.__usuarios.append(User)# añades a la lista el usuario que te esten pasando

    def agregar_libro(self, Book):
        self.__libros.append(Book)

    def buscar_libro(self, name):
        for book in self.__libros:
            if name.lower() == book.get_nombre().lower():
                libro= book
                break
        return libro

    def bool_buscar_libro(self,name):
        for book in self.__libros:
            if name.lower() == book.get_nombre().lower():
                band = True
                return band
        band=False
        return band



    def eliminar_libro(self,name):
        self.__libros.pop(self.get_libro_index(name))

    def get_libro_index(self,name):
        for index, libro in enumerate(self.__libros):
            if name== libro.get_nombre():
                return index
        print("LIBRO NO EXISTE")
        return -1

    def buscar_user(self,name):
        for user in self.__usuarios:
            if name.lower() == user.get_nombre().lower():
                return user

    def bool_buscar_user(self,name):
        for user in self.__usuarios:
            if name.lower() == user.get_nombre().lower():
                band = True
                return band
        band = False
        return band

    def mostrar_full_user(self,name):
        band= self.bool_buscar_user(name)
        if band:
            print("---USUARIO ESTATUS---")
            user = self.buscar_user(name)
            print("El usuario {} de {} años de edad, con un ID de {}\n"
                   .format(user.get_nombre(),user.get_edad(),user.get_id()))
            user.mostrar_libros_comprados()
            user.mostrar_libros_rentados()



    def mostrar_usuarios(self):
        print(" \n--USUARIOS--\n")
        for user in self.__usuarios:
            print(user.get_nombre())

    def mostrar_libros(self):
        print(" \n--LIBROS--\n")
        for book in self.__libros:
            print(book.get_nombre())

    def mostrar_usuarios_compra(self):
        print("\n --LISTA DE USUARIOS CON COMPRAS--\n")
        for user in self.__usuarios:
          if user.get_len_comprados() != 0:
              print("{}\n".format(user.get_nombre()))

    def mostrar_usuarios_renta(self):
        print("\n --LISTA DE USUARIOS CON RENTAS ACTIVAS--\n")
        for user in self.__usuarios:
          if user.get_len_rentados() != 0:
              print("{}\n".format(user.get_nombre()))

    def mostrar_libros_rentados(self):
        print("\n --LISTA DE LIBROS RENTADOS--\n")
        for book in self.__libros:
            if book.get_rentado():
                print("{} por el autor {}\n".format(book.get_nombre(),book.get_autor()))

    def mostrar_libros_NO_rentados(self):
        print("\n --LISTA DE LIBROS NO RENTADOS--\n")
        for book in self.__libros:
            if book.get_rentado()==False:
                print("{} por el autor {}\n".format(book.get_nombre(),book.get_autor()))