package goodluck;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        Person person = new Person("Peter", "Forsberg", 45);
        person.speak();

        Person p1 = new Person("Johannes", "Fryk", 32);


        System.out.println(p1.speak());
    }
}
