/**
 *
 * @author Ross Lowrance
 */
public class DoTheMath {

     public static void main(String[] args) {
        // Assigning byte, short, and int variables
        byte a = 25; // 1 byte
        short b = 32000; // 2 bytes
        int c = 1000000; // 4 bytes

        // Assigning byte variables
        byte x = 5;
        byte y = 10;
        byte z = 2;

        // Assigning a float variable
        float myFloat = 1.5f;

        // Performing operations and printing results
        System.out.println("x + y = " + (x + y));
        System.out.println("myFloat + myFloat = " + (myFloat + myFloat));
        System.out.println("myFloat + a = " + (myFloat + a));
        System.out.println("c - b = " + (c - b));
        System.out.println("x * a = " + (x * a));
        System.out.println("y * b = " + (y * b));
        System.out.println("c / b = " + (c / b));
        System.out.println("a / x = " + (a / x));
        System.out.println("a % x = " + (a % x));
        System.out.println("c % y = " + (c % y));
    }
}
