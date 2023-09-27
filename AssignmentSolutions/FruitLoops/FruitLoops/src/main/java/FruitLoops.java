/**
 *
 * @author Ross Lowrance
 */
public class FruitLoops {

 public static void main(String[] args) {
        // Create an array of 20 fruits
        String[] fruits = {
            "apple", "orange", "banana", "kiwi", "pear",
            "strawberry", "mango", "grape", "watermelon", "cherry",
            "pineapple", "blueberry", "apricot", "plum", "lemon",
            "raspberry", "peach", "pomegranate", "coconut", "grapefruit"
        };

        // Loop through the array and print each fruit on its own line
        for (String fruit : fruits) { // This differs from C#'s "in" keyword!
            System.out.println(fruit);
        }
    }
}
