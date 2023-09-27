/**
 *
 * @author Ross Lowrance
 */
public class InheritanceExample {

    public static class Person {
        String firstName;
        String lastName;
        int age;
    }

    // Student subclass inherits from Person
    public static class Student extends Person {
        int studentId;

        // Constructor for Student
        public Student(String firstName, String lastName, int age, int studentId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.studentId = studentId;
        }
    }

    public static void main(String[] args) {
        // Create a Student object using the Student constructor
        Student aliceSmith = new Student("Alice", "Smith", 20, 123456);

        // Accessing properties of the Student object
        System.out.println("Student Name: " + aliceSmith.firstName + " " + aliceSmith.lastName);
        System.out.println("Age: " + aliceSmith.age);
        System.out.println("Student ID: " + aliceSmith.studentId);
    }
}

