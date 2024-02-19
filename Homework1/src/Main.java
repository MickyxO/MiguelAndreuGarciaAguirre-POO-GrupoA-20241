public class Main {
    public static void main(String[] args) {

        System.out.println("EXERCISE NUMBER 1");
        Person p1=new Person("Pepe",23,"Male");
        p1.show_features();
        Person p2=new Person("Alexa",18,"Female");
        p2.show_features();
        Person p3=new Person("Aang",15,"Male");
        p3.show_features();
        Person p4=new Person("Karen",17,"Female");
        p4.show_features();

        //class book

        System.out.println("EXERCISE NUMBER 2");
        Book b1=new Book();
        b1.show_features();
        Book b2=new Book();
        b2.publication_year=2000;
        b2.author="Stephen King";
        b2.title="IT";
        b2.show_features();
        Book b3=new Book();
        b3.publication_year=1988;
        b3.author="Paulo Coelho";
        b3.title="El alquimista";
        b3.show_features();
        Book b4=new Book();
        b4.publication_year=1966;
        b4.author="Bryan Lee O´Malley";
        b4.title="Scott Pilgrim";
        b4.show_features();

        //class rectangle


        System.out.println("EXERCISE NUMBER 3");
        Rectangle r1=new Rectangle(24,32);
        System.out.println("The area is: "+r1.area_calculus());
        System.out.println("The perimeter is: "+r1.perimeter_calculus());
        Rectangle r2=new Rectangle(12.3,15.3);
        System.out.println("The area is: "+r2.area_calculus());
        System.out.println("The perimeter is: "+r2.perimeter_calculus());
        Rectangle r3=new Rectangle(10.6,32);
        System.out.println("The area is: "+r3.area_calculus());
        System.out.println("The perimeter is: "+r3.perimeter_calculus());
        Rectangle r4=new Rectangle(10,10);
        System.out.println("The area is: "+r4.area_calculus());
        System.out.println("The perimeter is: "+r4.perimeter_calculus());

    }
}