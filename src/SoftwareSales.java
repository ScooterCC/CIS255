
import java.util.Scanner;

public class SoftwareSales {

    public static void main(String[] args) {
        int quantity;
        double totalPrice, discount;
        final int UNITPRICE = 99;

        Scanner numPackages = new Scanner(System.in);

        System.out.print("Enter the number of packages purchased: ");
        quantity = numPackages.nextInt();

        totalPrice = quantity * UNITPRICE;

        if (quantity > 9 && quantity < 20) {
            discount = totalPrice * .2;
            totalPrice = totalPrice - discount;
        }

        else if (quantity > 19 && quantity < 50) {
            discount = totalPrice * .3;
            totalPrice = totalPrice - discount;
        }

        else if (quantity > 49 && quantity < 100) {

            discount = totalPrice * .4;
            totalPrice = totalPrice - discount;
        }

        else if (quantity > 99) {

            discount = totalPrice * .5;
            totalPrice = totalPrice - discount;
        }

        else {

            discount = 0;
        }

        System.out.printf("Your discount: $%,.2f\n", discount);
        System.out.printf("Your total after discount: $%,.2f\n", totalPrice);
    }
}
