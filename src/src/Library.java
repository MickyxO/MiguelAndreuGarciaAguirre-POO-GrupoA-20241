import java.util.ArrayList;

public class Library {

    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void addUser(User user1) {
        users.add(user1);
    }

    public static boolean bool_search_book(String name) {
        boolean band;
        for (Book book : books) {
            if (name.equalsIgnoreCase(book.getTitle())) {
                band = true;
                return band;
            }
        }
        band = false;
        return band;
    }

    public static Book search_book(String name) {
        Book libro = null;
        for (Book book : books) {
            if (name.equalsIgnoreCase(book.getTitle())) {
                libro = book;
                return libro;
            }
        }
        return libro;
    }

    public static void delete_book(String name) {
        books.remove(Library.get_book_index(name));
    }

    public static int get_book_index(String name) { //al comprar haz la bandera
        int i, x = 0;
        for (i = 0; i <= books.size(); i++) {
            Book book = books.get(i);
            if (name.equalsIgnoreCase(book.getTitle())) {
                x = i;
                break;
            }
        }
        return x;
    }

    public static boolean bool_search_user(String name) {
        boolean band = false;
        for (User user1 : users) {
            if (name.equalsIgnoreCase(user1.getName())) {
                band = true;
                return band;
            }
        }
        return band;
    }

    public static User buscar_user(String name) {
        User usuario = null;
        for (User user1 : users) {
            if (name.equalsIgnoreCase(user1.getName())) {
                usuario = user1;
                return usuario;
            }
        }
        return usuario;
    }

    public static void show_users() {
        System.out.println("---USERS---\n");
        for (User user : users) {
            System.out.println(user.getName() + " de " + user.getAge() + " años de edad.");
        }
    }

    public static void show_books() {
        System.out.println("---BOOKS---\n");
        for (Book book : books) {
            System.out.println(book.getTitle() + " del autor: " + book.getAuthor());
        }
    }

    public static void show_users_buy() {
        System.out.println("---USERS WITH PURCHASES---\n");
        for (User user : users) {
            if (user.get_len_buy() != 0) {
                System.out.println(user.getName() + " de " + user.getAge() + " años de edad.");
            }
        }
    }

    public static void show_users_rent() {
        System.out.println("---USERS WITH RENTED BOOKS---\n");
        for (User user : users) {
            if (user.get_len_rent() != 0) {
                System.out.println(user.getName() + " de " + user.getAge() + " años de edad.");
            }
        }
    }

    public static void show_rented_books() {
        System.out.println("---CURRENT RENTED BOOKS---\n");
        for (Book book : books) {
            if (book.get_rented()) {
                System.out.println(book.getTitle() + " del autor: " + book.getAuthor());
            }
        }
    }

    public static void show_notrented_books(){
        System.out.println("---CURRENT NOT RENTED BOOKS---\n");
        for (Book book : books) {
            if (book.get_rented()==false) {
                System.out.println(book.getTitle() + " del autor: " + book.getAuthor());
            }
        }
    }

    public static void show_full_user(String name){
        boolean band= Library.bool_search_user(name);
        if (band){
            System.out.println("---FULL USER STATUS---\n");
            User user= Library.buscar_user(name);
            System.out.println(user.getName() + " de " + user.getAge() + " años de edad.");
            user.show_mybought();
            user.show_myrented();
        }
    }

}