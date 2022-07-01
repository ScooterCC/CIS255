import java.util.Scanner;

public class RetailPriceCalculator {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double wholeCost; // Hold user input for wholesale cost.
        double markUp;   // Hold user input for mark up.

        // Wholesale cost from user.
        System.out.println("Enter wholesale price");
        wholeCost = input.nextDouble();

        // Mark up from user.
        System.out.println("Enter mark up percentage as a whole number .");
        markUp = input.nextDouble();

        // Call to calculate retail method.
        double price = calculateRetail(wholeCost, markUp);

        // The new value of price is result1. Will print price.
        System.out.println( price);
    }

    public static double calculateRetail(double wC, double markUp) {
        double result = (wC + wC * (markUp / 100));
        System.out.println(result);
        return result;
    }
}