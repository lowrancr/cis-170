/**
 *
 * @author Ross Lowrance
 */

import java.util.Scanner;

public class WhatsYourFunction {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many bottles of Root Beer do you want to count? ");
        int numBottles = scanner.nextInt();

        scanner.close();

        singRootBeerSong(numBottles);

    }
    public static void singRootBeerSong(int numBottles) {
        while (numBottles >= 2) {
            System.out.println(numBottles + " bottles of root beer on the wall,");
            System.out.println(numBottles + " bottles of root beer,");
            System.out.println("take one down, pass it around,");
            numBottles--;
            if(numBottles == 1) {
                System.out.println(numBottles + " bottle of root beer on the wall.");
            } else {
            System.out.println(numBottles + " bottles of root beer on the wall.");
            }
        }

        
        System.out.println(numBottles + " bottle of root beer on the wall,");
        System.out.println(numBottles + " bottle of root beer,");
        System.out.println("take one down, pass it around,");
        System.out.println("no more bottles of root beer on the wall!");
 
        }
    }


