import java.util.Random;

public class Book {
    private String title;
    private String author;
    private boolean is_rented;
    private double price;

    public Book(String name, String author, double price){
        this.title=name;
        this.author=author;
        this.price= price;
        this.is_rented= false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean get_rented() {
        return is_rented;
    }

    public void set_rented(boolean is_rented) {
        this.is_rented = is_rented;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
