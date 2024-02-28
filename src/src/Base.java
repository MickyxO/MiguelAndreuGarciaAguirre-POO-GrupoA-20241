public class Base {

        public static void main(String[] args) {
            Product p1= new Product("Coca",120.4,12);

            System.out.println(p1.getPrice());
            p1.setPrice(450.2);
            System.out.println(p1.getPrice());
            System.out.println(p1.getName());
            p1.setName("");
            System.out.println(p1.getName() + "name");

        }

}
