public class PayRoll {

    private int[] employeeId = {5658845, 4520125, 7895122, 8477541, 8451277, 1302850, 7580489};
    private final int NUMBER_OF_EMPLOYEES = employeeId.length;
    //Number of hours worked by each employee
    private double[] hours;
    //Employee's hourly pay rate
    private double[] payRate;
    //Employee's gross wages.
    private double[] wages;

    //returns id of index
    public void calculateWages() {
        for (int employeeIndex = 0; employeeIndex < NUMBER_OF_EMPLOYEES; employeeIndex++) {
            wages[employeeIndex] = hours[employeeIndex] * payRate[employeeIndex];
        }
    }

    public double getEmployeeWagesById(int employeeIdGiven) {
        for (int employeeIndex = 0; employeeIndex < NUMBER_OF_EMPLOYEES; employeeIndex++) {
            if (employeeId[employeeIndex] == employeeIdGiven) {
                return wages[employeeIndex];
            }
        }
        return -1;
    }

    public int[] getAllEmployeeIds() {
        return employeeId;
    }

    public double[] getAllEmployeeHours() {
        return hours;
    }

    public double[] getAllEmployeePayRates() {
        return payRate;
    }

    public double[] getAllEmployeeWages() {
        return wages;
    }

    public void setEmployeeHours(int employeeHoursGiven, int employeeIndexGiven) {
        hours[employeeIndexGiven]=employeeHoursGiven;
    }

    public void setEmployeePayRate(double employeePayRateGiven, int employeeIndexGiven) {
        hours[employeeIndexGiven]=employeePayRateGiven;
    }

    public PayRoll() {
        hours = new double[NUMBER_OF_EMPLOYEES];
        payRate = new double[NUMBER_OF_EMPLOYEES];
        wages = new double[NUMBER_OF_EMPLOYEES];
    }
}
