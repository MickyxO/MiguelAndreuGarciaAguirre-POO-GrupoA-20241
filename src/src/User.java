import java.util.Random;
import java.util.ArrayList;
public class User {
    Random ran= new Random();

    private int id;
    private String name;
    private int age;
    private ArrayList<Book> rented_books = new ArrayList<>();
    private ArrayList<Book> purchased_books = new ArrayList<>();

    public User(String nombre,int edad){
        this.id= ran.nextInt(1,1000);
        this.name= nombre;
        this.age=edad;
    }

    public void rent_book(String name){
        if (Library.bool_search_book(name)){
            Book book= Library.search_book(name);
            if (book.get_rented()){
                System.out.println("El libro esta rentado, lo sentimos.");
            } else {
                book.set_rented(true);
                this.rented_books.add(book);
                System.out.println("LIBRO RENTADO");
            }
        } else{
            System.out.println("LIBRO NO EXISTENTE. ");
        }
    }

    public void unrent_book(String name) {
        if (Library.bool_search_book(name) ) {
            Book book = Library.search_book(name);
            if (book.get_rented() ){
                for (Book libro: this.rented_books){
                    if (book.getTitle().equalsIgnoreCase(libro.getTitle())){
                        book.set_rented(false);
                        System.out.println("LIBRO DEVUELTO");
                        break;
                    }
                }
            } else {
                System.out.println("EL LIBRO NO ESTA RENTADO ");
            }
        } else {
            System.out.println("LIBRO NO EXISTENTE! ");
        }
    }

    public void buy_book(String name){
        if (Library.bool_search_book(name)){
            Book book= Library.search_book(name);
            this.purchased_books.add(book);
            Library.delete_book(name);
            System.out.println("LIBRO COMPRADO, DISFRUTA TU COMPRA!");
        }
        else {
            System.out.println("LIBRO NO EXISTENTE.");
        }
    }

    public void show_myrented(){
        System.out.println("---MY RENTED BOOKS---\n");
        for (Book book: rented_books){
            System.out.println(book.getTitle() + " del autor: " + book.getAuthor());
        }
    }

    public void show_mybought(){
        System.out.println("---MY PURCHASED BOOKS---\n");
        for (Book book: purchased_books){
            System.out.println(book.getTitle() + " del autor: " + book.getAuthor());
        }
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public int get_len_buy(){
        return this.purchased_books.size();
    }

    public int get_len_rent(){
        return this.rented_books.size();
    }

}
