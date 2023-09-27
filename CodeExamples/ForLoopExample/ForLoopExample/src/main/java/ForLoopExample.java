/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Ross Lowrance
 */
public class ForLoopExample {
    public static void main(String[] args) {
        // Example 1: Loop from 1 to 5
        System.out.println("Example 1:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example 2: Loop for even numbers from 2 to 10
        System.out.println("\nExample 2:");
        for (int j = 2; j <= 10; j += 2) {
            System.out.println("Even number: " + j);
        }

        // Example 3: Loop in reverse from 5 to 1
        System.out.println("\nExample 3:");
        for (int k = 5; k >= 1; k--) {
            System.out.println("Countdown: " + k);
        }
    }
}


