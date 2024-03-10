import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        char c;
        System.out.println("WELCOME TO THE LIBRARY!");
        do {
            System.out.println("\nQue acción desea realizar?\n " +
                    "1. Añadir un nuevo libro. \n" +
                    "2. Añadir un nuevo usuario. \n" +
                    "3. Como usuario, rentar un libro. \n" +
                    "4. Como usuario, comprar un libro. \n" +
                    "5. Mostrar todos los libros. \n" +
                    "6. Mostrar todos los usuarios. \n" +
                    "7. Mostrar todos los libros que estan en renta. \n"+
                    "8. Mostrar todos los libros que no estan en renta. \n"+
                    "9. Como usuario, mostrar toda mi informacion. \n"+
                    "A. Mostrar todos los usuarios que han hecho compras. \n"+
                    "B. Mostrar todos los usuarios con rentas activas. \n" +
                    "C. Mostrar la informacion de un libro. \n" +
                    "D. Como usuario, regresar un libro rentado. \n"+
                    "E= EXIT \n");
            c = read.next().charAt(0);
            read.nextLine();
            switch (c){
                case '1':
                    System.out.println("Ingresa el nombre de tu libro: ");
                    String name= read.nextLine();
                    System.out.println("Ingresa el autor de el libro: ");
                    String author = read.nextLine();
                    System.out.println("Cual es el precio de el libro: ");
                    double price= read.nextDouble();
                    Library.addBook(new Book(name,author,price));
                    System.out.println("LIBRO AGREGADO! ");
                    break;
                case '2':
                    System.out.println("Ingresa el nombre de tu usuario: ");
                    String name1= read.nextLine();
                    System.out.println("Ingresa la edad de tu usario: ");
                    int edad=read.nextInt();
                    Library.addUser(new User(name1,edad));
                    System.out.println("USUARIO AGREGADO!");
                    break;
                case '3':
                    System.out.println("Ingresa el nombre de tu usuario: ");
                    String name2= read.nextLine();
                    boolean band= Library.bool_search_user(name2);
                    if (band){
                        User user= Library.buscar_user(name2);
                        System.out.println("LOS LIBROS DISPONIBLES PARA RENTA SON: ");
                        Library.show_notrented_books();
                        System.out.println("Que libro deseas rentar? ");
                        String title1= read.nextLine();
                        user.rent_book(title1);
                    }
                    else {
                        System.out.println("USUARIO NO EXISTENTE! ");
                    }
                    break;
                case '4':
                    System.out.println("Ingresa el nombre de tu usuario: ");
                    String name3= read.nextLine();
                    boolean bando= Library.bool_search_user(name3);
                    if (bando){
                        User user= Library.buscar_user(name3);
                        System.out.println("LOS LIBROS DISPONIBLES PARA COMPRA SON: ");
                        Library.show_notrented_books();
                        System.out.println("Que libro deseas comprar? ");
                        String title4= read.nextLine();
                        user.buy_book(title4);
                    }
                    else {
                        System.out.println("USUARIO NO EXISTENTE. ");
                    }
                    break;
                case '5':
                    Library.show_books();
                    break;
                case '6':
                    Library.show_users();
                    break;
                case '7':
                    Library.show_rented_books();
                    break;
                case '8':
                    Library.show_notrented_books();
                    break;
                case '9':
                    System.out.println("Ingresa el nombre de tu usuario: ");
                    String name4= read.nextLine();
                    boolean bande= Library.bool_search_user(name4);
                    if (bande){
                        Library.show_full_user(name4);
                    }
                    else {
                        System.out.println("USUARIO NO EXISTENTE. ");
                    }
                    break;
                case 'A':
                    Library.show_users_buy();
                    break;
                case 'B':
                    Library.show_users_rent();
                    break;
                case 'C':
                    System.out.println("Los libros en existencia son: ");
                    Library.show_books();
                    System.out.println("Ingresa el libro del que deseas obtener informacion");
                    String title5= read.nextLine();
                    boolean ban= Library.bool_search_book(title5);
                    if (ban){
                        Book book = Library.search_book(title5);
                        System.out.println("El libro "+book.getTitle()+ " hecho por el autor "+book.getAuthor()+" con un precio de $"+book.getPrice());
                    }
                    break;
                case 'D':
                    System.out.println("Ingresa el nombre de tu usuario: ");
                    String name5= read.nextLine();
                    boolean banda= Library.bool_search_user(name5);
                    if (banda){
                        User user= Library.buscar_user(name5);
                        System.out.println("TUS LIBROS ACTUALES EN RENTA SON: ");
                        user.show_myrented();
                        System.out.println("QUE LIBRO DESEAS REGRESAR? ");
                        String ret= read.nextLine();
                        user.unrent_book(ret);
                    } else{
                        System.out.println("USUARIO NO EXISTENTE! ");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione otra. ");
            }

        }while (c!='E');
    }
}