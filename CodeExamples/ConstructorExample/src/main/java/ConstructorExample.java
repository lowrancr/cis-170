/**
 *
 * @author Ross Lowrance
 */
public class ConstructorExample {

   public static class Person {
        String firstName;
        String lastName;
        int age;

        // Constructor for the Person class
        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Create a Person object using the constructor
        Person johnDoe = new Person("John", "Doe", 30);

        // Accessing object properties
        System.out.println("First Name: " + johnDoe.firstName);
        System.out.println("Last Name: " + johnDoe.lastName);
        System.out.println("Age: " + johnDoe.age);
    }
}
