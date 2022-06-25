// Scanner utility.
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Variables.
        int x =0, y=0;

        // New scanner for user input.
        Scanner input=new Scanner(System.in);

        // Loop control statement.
        boolean repeat=true;

        // Loop until valid input is received.
        while(repeat) {
            // Try/Catch to loop after exceptions.
            try {
                while (x<=0) {// This will force user to enter a positive integer greater than 0.
                    // Prompt user for number input.
                    System.out.print("Enter any number greater than zero (excluding decimals): ");
                    x = input.nextInt();// Assign number variable to user input.
                }
                repeat=false;// This will end the while loop.
            }
            // Try/Catch to loop after exceptions.
            catch (Exception e) {
                System.out.println("READ CAREFULLY!");// Informs user to read the request carefully.
                input.next();// Clears the previous user input from scanner.
                repeat=true;// Allows loop to start over after an exception has been caught.
            }
        }
        // Loop for adding all numbers from user input to 0.
        for (int i=0; i<=x; i++) {
            y = y+i;
        }
        System.out.println(y);// Prints the final result.
    }
}