/**
 *
 * @author Ross Lowrance
 */
public class ObjectExample {
    public static class Person {
        String firstName;
        String lastName;
        int age;
    }
    public static void main(String[] args) {
        Person johnDoe = new Person();
        johnDoe.firstName = "John";
        johnDoe.lastName = "Doe";
        johnDoe.age = 30;
    }
}
