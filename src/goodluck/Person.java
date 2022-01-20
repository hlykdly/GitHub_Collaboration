package goodluck;

public class Person {
    String firstName;
    String lastName;
    int Age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
    }


    public void speak () {
        System.out.println("Hello my name is " + firstName + " " + lastName);

    }
}
