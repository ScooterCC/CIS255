public class Employee {

    // Variables.
    private String name, department, position;
    private int idNumber;

    // Constructor.
    public Employee(String name,int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // Constructor.
    public Employee( String employeeName, int employeeIdNumber ) {
        name = employeeName;
        idNumber = employeeIdNumber;
    }

    // Constructor.
    public Employee(){}
    // Getters and Setters.
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public int getIdNumber() {
        return idNumber;}
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;}
    public String getDepartment() {
        return department;}
    public void setDepartment(String department) {
        this.department = department;}
    public String getPosition() {
        return position;}
    public void setPosition(String position) {
        this.position = position;}

    // Return.
    public String toString(){

        return "[" +
                this.getName() +
                " | " +
                this.getIdNumber() +
                " | " +
                this.getDepartment() +
                " | " +
                this.getPosition() +
                "]";
    }
}
