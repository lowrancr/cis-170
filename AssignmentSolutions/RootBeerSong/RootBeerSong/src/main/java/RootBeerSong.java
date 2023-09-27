/**
 *
 * @author Ross Lowrance
 */

public class RootBeerSong {

    public static void main(String[] args) {
        int numBottles = 99; // You can manually set the number of bottles here

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

