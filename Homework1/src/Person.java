public class Person {

    String name,gender;
    int age;
    public Person(String nam, int ag,String sex){
        name= nam;
        age= ag;
        gender=sex;
    }

    public void show_features () {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println("------------------------");
    }
}
