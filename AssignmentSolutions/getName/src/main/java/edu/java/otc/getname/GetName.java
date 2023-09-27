package edu.java.otc.getname;

/**
 * @author Ross Lowrance
 */

import java.util.Scanner;

public class GetName {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their First Name
        System.out.print("Enter your First Name: ");
        String fName = scanner.nextLine();

        // Prompt the user to enter their Middle Name
        System.out.print("Enter your Middle Name (initial): ");
        char middleI = scanner.nextLine().charAt(0);

        // Prompt the user to enter their Last Name
        System.out.print("Enter your Last Name: ");
        String lName = scanner.nextLine();

        // Close the scanner to release resources
        scanner.close();

        // Print the greeting message
        System.out.println("It is nice to meet you, " + fName + " " + middleI + ". " + lName + ".");
    }
}
