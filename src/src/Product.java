public class Product {

    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock= stock;
    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        stock=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null){
            this.name = name;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0 ){
            this.price = price;
        }

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock>=0){
            this.stock = stock;
        }

    }

    public void add_stock (int number){
        if (number>0){
            stock+=number;
        }
    }

    public void delete_stock (int number){
        if (number >0 && number<=stock){
            stock-=number;
        }
    }


}
