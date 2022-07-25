import java.util.Scanner;
public class PayRollProgram {
    public static void assignEmployeeHoursAndPayrates(PayRoll payRollObject) {
        Scanner keyboard = new Scanner(System.in);
        int employeeHours;
        double employeePayRate;

        for (int employeeIndex = 0; employeeIndex < payRollObject.getAllEmployeeIds().length; employeeIndex++) {
            System.out.println("Please enter the hours for employee " + payRollObject.getAllEmployeeIds()[employeeIndex]);
            employeeHours = keyboard.nextInt();
            while(employeeHours<0) {
                System.out.println("Please enter POSITIVE hours for employee " +
                        payRollObject.getAllEmployeeIds()[employeeIndex]);
                employeeHours = keyboard.nextInt();
            }
            payRollObject.setEmployeeHours(employeeHours, employeeIndex);
            System.out.println("What's the pay rate for the employee " + payRollObject.getAllEmployeeIds()[employeeIndex]);
            employeePayRate = keyboard.nextDouble();
            while(employeePayRate<6.00){
                System.out.println("What's the pay rate for the employee "+
                        payRollObject.getAllEmployeeIds()[employeeIndex] + "(ABOVE $6 please)");
                employeePayRate = keyboard.nextDouble();
            }
            payRollObject.setEmployeePayRate(employeePayRate, employeeIndex);
        }
    }

    public static void displayEmployeeWages(PayRoll payRollObject){
        for (int employeeIndex = 0; employeeIndex < payRollObject.getAllEmployeeIds().length; employeeIndex++) {
            System.out.println("The employee with ID number " + payRollObject.getAllEmployeeIds()[employeeIndex]+
                    " worked for " + payRollObject.getAllEmployeeHours()[employeeIndex] +
                    " hours and earned $" + payRollObject.getAllEmployeeWages()[employeeIndex]);
        }
    }

    public static void main(String[]args) {
        PayRoll employeeInfo = new PayRoll();
        assignEmployeeHoursAndPayrates(employeeInfo);
        employeeInfo.calculateWages();
        displayEmployeeWages(employeeInfo);
    }
}
