public class ProgramEmployee {

        public static void main(String[] args){

            Employee employee1 = new Employee("Frank", "Freddy", 1000);
            printEmployee(employee1);

            Employee employee2 = new Employee("Jack", "Jackson", 768);
            printEmployee(employee2);

            System.out.println("\nAfter 10% raises:\n");
            // set raises of 10%
            employee1.setRaise(10);
            printEmployee(employee1);

            employee2.setRaise(10);
            printEmployee(employee2);

        }
        private static void printEmployee(Employee employee){
            System.out.printf("%s %s: $%.2f per annum\n",
                    employee.getFirstName(), employee.getLastName(),
                    employee.getYearlySalary());
        }

}
