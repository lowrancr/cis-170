/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Ross Lowrance
 */
public class ForEachLoopExample {
    public static void main(String[] args) {
        // Example 1: Iterating through an array
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Example 1:");
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Example 2: Iterating through a String
        String message = "Hello, World!";
        System.out.println("\nExample 2:");
        for (char ch : message.toCharArray()) {
            System.out.println("Character: " + ch);
        }
    }
}
