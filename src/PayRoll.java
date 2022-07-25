public class PayRoll {

    // Employee ID
    private int[] employeeId = {5658845, 4520125, 7895122, 8477541, 8451277, 1302850, 7580489};
    private final int NUMBER_OF_EMPLOYEES = employeeId.length;
    // Employee hours worked
    private int[] hours;
    // Employee pay rate
    private double[] payRate;
    // Employee gross wages
    private double[] wages;

    // Calculate employee wages
    public void calculateWages() {
        for (int employeeIndex = 0; employeeIndex < NUMBER_OF_EMPLOYEES; employeeIndex++) {
            wages[employeeIndex] = hours[employeeIndex] * payRate[employeeIndex];
        }
    }

    // ID accessor
    public int[] getAllEmployeeIds() {
        return employeeId;
    }
    // Hours accessor
    public int[] getAllEmployeeHours() {
        return hours;
    }
    // Wages accessor
    public double[] getAllEmployeeWages() {
        return wages;
    }
    // Hours mutator
    public void setEmployeeHours(int employeeHoursGiven, int employeeIndexGiven) {
        hours[employeeIndexGiven]=employeeHoursGiven;
    }
    // Pay rate mutator
    public void setEmployeePayRate(double employeePayRateGiven, int employeeIndexGiven) {
        payRate[employeeIndexGiven]=employeePayRateGiven;
    }
    // Constructor
    public PayRoll() {
        hours = new int[NUMBER_OF_EMPLOYEES];
        payRate = new double[NUMBER_OF_EMPLOYEES];
        wages = new double[NUMBER_OF_EMPLOYEES];
    }
}
