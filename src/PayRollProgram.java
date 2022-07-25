// Scanner utility
import java.util.Scanner;
public class PayRollProgram {
    public static void assignEmployeeHoursAndPayrates(PayRoll payRollObject) {
        Scanner keyboard = new Scanner(System.in);
        int employeeHours;
        double employeePayRate;

        // Ask user for data
        for (int employeeIndex = 0; employeeIndex < payRollObject.getAllEmployeeIds().length; employeeIndex++) {
            System.out.println("Please enter the hours for employee " + payRollObject.getAllEmployeeIds()[employeeIndex]);
            employeeHours = keyboard.nextInt();
            while(employeeHours<0) { // Ask for a positive amount of hours worked
                System.out.println("Please enter POSITIVE hours for employee " +
                        payRollObject.getAllEmployeeIds()[employeeIndex]);
                employeeHours = keyboard.nextInt();
            }
            payRollObject.setEmployeeHours(employeeHours, employeeIndex);
            System.out.println("What's the pay rate for the employee " + payRollObject.getAllEmployeeIds()[employeeIndex]);
            employeePayRate = keyboard.nextDouble();
            while(employeePayRate<6.00){ // Ask for rate of $6 or greater
                System.out.println("Enter the pay rate for the employee "+
                        payRollObject.getAllEmployeeIds()[employeeIndex] + " (Pay rate must be greater than $6)");
                employeePayRate = keyboard.nextDouble();
            }
            payRollObject.setEmployeePayRate(employeePayRate, employeeIndex);
        }
    }
    // Display data
    public static void displayEmployeeWages(PayRoll payRollObject){
        for (int employeeIndex = 0; employeeIndex < payRollObject.getAllEmployeeIds().length; employeeIndex++) {
            System.out.println("The employee with ID number " + payRollObject.getAllEmployeeIds()[employeeIndex]+
                    " worked for " + payRollObject.getAllEmployeeHours()[employeeIndex] +
                    " hours and earned " +
                    String.format("$%,.2f", payRollObject.getAllEmployeeWages()[employeeIndex]));
        }
    }

    public static void main(String[]args) {
        PayRoll employeeInfo = new PayRoll();
        assignEmployeeHoursAndPayrates(employeeInfo);
        employeeInfo.calculateWages();
        displayEmployeeWages(employeeInfo);
    }
}
