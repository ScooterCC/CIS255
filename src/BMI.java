// Scanner utility.
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        // Variables.
        double weight, feet, inches, bmi, hinches;

        // New scanner for user input.
        Scanner input = new Scanner(System.in);

        // Prompt user for weight in pounds.
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextInt(); // Assign weight variable to user input.

        // Prompt user for height in feet and inches.
        System.out.println("Enter your height in feet and inches. ");
        System.out.print("Feet: "); // Prompt for feet.
        feet = input.nextInt(); // Assign feet variable to user input.
        System.out.print("Inches: "); // Prompt for inches.
        inches = input.nextInt(); // Assign inches variable to user input.

        // Set hinches variable equal to height in inches only by multiplying feet x 12.
        hinches = (feet * 12) + inches;

        // Set bmi equal to bmi formula BMI = (weight in pounds x 703) / (height in inches^2).
        bmi = (weight * 703) / (hinches * hinches);

        // Display bmi.
        System.out.printf("Your BMI is: %.1f\n", bmi);

        // Display whether the user is underweight, overweight, or at optimal weight.
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        }
        else if (bmi > 25) {
            System.out.println("You are overweight.");
        }
        else {
            System.out.println("You are at optimal weight.");
        }
    }
}