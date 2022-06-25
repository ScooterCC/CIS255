// Scanner utility.
import java.util.Scanner;

public class RomanNumeral {

    public static void main(String[] args) {

        // Number variable.
        int num;

        // New scanner for user input.
        Scanner input = new Scanner(System.in);

        // Prompt user for number.
        System.out.print("Enter a number in the range of 1 - 10: ");
        num = input.nextInt(); // Assign num variable to user input.

        // Display roman numeral equivalent to user number input.
        switch (num) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");

            // Display error if number is not 1 - 10
            default -> System.out.println("Invalid number!");
        }
    }
}