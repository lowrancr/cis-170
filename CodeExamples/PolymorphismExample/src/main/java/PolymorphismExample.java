/**
 *
 * @author Ross Lowrance
 */
public class PolymorphismExample {
    public static class Person {
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void introduce() {
            System.out.println("I am " + firstName + " " + lastName + " and I am " + age + " years old.");
        }
    }

    public static class Student extends Person {
        int studentId;

        public Student(String firstName, String lastName, int age, int studentId) {
            super(firstName, lastName, age);
            this.studentId = studentId;
        }

        @Override
        public void introduce() {
            System.out.println("I am a student with ID " + studentId + ".");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        Student student = new Student("Alice", "Smith", 20, 123456);

        // Polymorphism: A Person reference can point to a Student object
        Person reference = student;

        // Call the introduce() method on the reference
        reference.introduce();

        // Access the unique properties of the Student object
        System.out.println("Student ID: " + student.studentId);
    }
}

