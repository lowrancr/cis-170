
/**
 *
 * @author Ross Lowrance
 */
import java.util.Arrays;


public class HaveSomeClass {

    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = {
            new Person("John", 'A', "Doe", "01/15/1990", "123-45-6789", true, new String[]{"Fido", "Fluffy"}),
            new Person("Jane", 'B', "Smith", "05/20/1985", "987-65-4321", false, null),
            new Person("Alice", 'C', "Johnson", "12/03/2000", "567-89-0123", true, new String[]{"Rex"}),
            new Person("Bob", '\u0000', "Brown", "09/10/1978", "321-54-9876", false, null),
            new Person("Eve", 'D', "Williams", "03/25/1995", "654-32-1098", true, new String[]{"Whiskers"}),
            new Person("Charlie", '\u0000', "Lee", "07/08/1982", "876-12-3456", true, new String[]{"Buddy", "Mittens"})
        };
        
        public class Person {
    private String fName;
    private char mInitial;
    private String lName;
    private String DOB;
    private String SSN;
    private boolean hasPets;
    private String[] pets;

    public Person(String fName, char mInitial, String lName, String DOB, String SSN, boolean hasPets, String[] pets) {
        this.fName = fName;
        this.mInitial = mInitial;
        this.lName = lName;
        this.DOB = DOB;
        this.SSN = SSN;
        this.hasPets = hasPets;
        this.pets = pets;
    }

    public String getFullName() {
        return fName + " " + (mInitial != '\u0000' ? mInitial + ". " : "") + lName;
    }
    }
}
