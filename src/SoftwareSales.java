// Scanner utility.
import java.util.Scanner;

public class SoftwareSales {

    public static void main(String[] args) {

        // Variables.
        int quantity;
        double totalPrice, discount;
        final int UNITPRICE = 99;

        // New scanner for user input.
        Scanner input = new Scanner(System.in);

        // Prompt user for number of packages purchased.
        System.out.print("Enter the number of packages purchased: ");
        quantity = input.nextInt(); // Assign quantity variable to user input.

        // Set totalPrice variable equal to quantity x unit price.
        totalPrice = quantity * UNITPRICE;

        // Set discount at 20% if quantity purchased is between 10 and 19, and apply discount to totalPrice.
        if (quantity > 9 && quantity < 20) {
            discount = totalPrice * .2;
            totalPrice = totalPrice - discount;
        }

        // Set discount at 30% if quantity purchased is between 20 and 49, and apply discount to totalPrice.
        else if (quantity > 19 && quantity < 50) {
            discount = totalPrice * .3;
            totalPrice = totalPrice - discount;
        }

        // Set discount at 40% if quantity purchased is between 50 and 99, and apply discount to totalPrice.
        else if (quantity > 49 && quantity < 100) {
            discount = totalPrice * .4;
            totalPrice = totalPrice - discount;
        }

        // Set discount at 50% if quantity purchased is over 99, and apply discount to totalPrice.
        else if (quantity > 99) {
            discount = totalPrice * .5;
            totalPrice = totalPrice - discount;
        }

        // Set discount at 0% if quantity purchased is less than 10. No discount is applied.
        else {
            discount = 0;
        }

        // Display the discount and total with discount applied.
        System.out.printf("Your discount: $%,.2f\n", discount);
        System.out.printf("Your total after discount: $%,.2f\n", totalPrice);
    }
}
