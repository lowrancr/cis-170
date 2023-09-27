/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Ross Lowrance
 */
public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Access and print individual elements of the array
        System.out.println("Element at index 0: " + numbers[0]); // 10
        System.out.println("Element at index 2: " + numbers[2]); // 30

        // Modify an element in the array
        numbers[1] = 25;
        System.out.println("Modified element at index 1: " + numbers[1]); // 25

        // Find the length of the array
        int length = numbers.length;
        System.out.println("Length of the array: " + length); // 5
    }
}
