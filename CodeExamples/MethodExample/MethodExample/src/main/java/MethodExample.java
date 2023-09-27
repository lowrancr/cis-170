/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Ross Lowrance
 */
public class MethodExample {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        
        int z = add(x, y); // Call the add method
        
        System.out.println("The sum of " + x + " and " + y + " is: " + z);
    }

    // Method to add two integers and return the result
    public static int add(int x, int y) {
        int z = x + y; // Add x and y
        return z;      // Return the result
    }
}

