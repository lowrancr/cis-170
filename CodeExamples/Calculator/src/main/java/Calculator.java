/**
 *
 * @author Ross Lowrance
 */
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String str1, String str2) {
        return str1 + str2;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int sum1 = calc.add(5, 10);
        double sum2 = calc.add(3.5, 2.7);
        String result = calc.add("Hello, ", "world!");
        
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated strings: " + result);
    }
}

