// Scanner utility.
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        // Variables.
        int t=0,s=0,y=0;

        // New scanner for user input.
        Scanner input=new Scanner(System.in);

        // Loop control statement.
        boolean repeat=true;

        // Loop until valid input is received.
        while(repeat) {
            // Try/Catch to loop after exceptions.
            try {
                while (t<=0) {// This will force user to enter a positive integer greater than 0.
                    // Prompt user for number input.
                    System.out.println("How long has the vehicle been traveling? (hours only)");
                    t = input.nextInt();// Assign number variable to user input.
                }
                while (s<=0) {// This will force user to enter a positive integer greater than 0.
                    // Prompt user for number input.
                    System.out.println("How fast was the vehicle traveling? (mph)");
                    s = input.nextInt();// Assign number variable to user input.
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

        // Loop for displaying distance traveled each hour.
        for (int i=1; i<=t; i++) {
            System.out.println("Vehicle has traveled "+(i*s)+" miles in "+i+" hours.");
        }
    }
}