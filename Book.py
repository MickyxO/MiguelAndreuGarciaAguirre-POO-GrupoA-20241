import random
from Library import Library
class Book:
    __id=0
    __nombre="" #guion bajo es privado, sin guion bajo es publico
    __autor= ""
    __es_rentado = False
    __precio=0
    library=Library()

    def __init__ (self,nombre,autor,precio): #son dos guiones a la hora de iniciar clases
        self.__id= random.randint(1,1000)
        self.__nombre = nombre
        self.__autor = autor
        self.__precio = precio
        self.__es_rentado= False


    def get_rentado(self):
        return self.__es_rentado

    def set_rentado(self):
        self.__es_rentado=True

    def set_unrentado(self):
        self.__es_rentado=False

    def get_nombre(self):
        return self.__nombre

    def get_autor(self):
        return self.__autor

    def get_precio(self):
        return self.__precio