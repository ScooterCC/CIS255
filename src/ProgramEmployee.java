public class ProgramEmployee {

        public static void main(String[] args) {
            // New Employee information.
            Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
            Employee employee2 = new Employee("Mark Jones", 39119);
            Employee employee3 = new Employee();

            // New Employee information.
            employee2.setDepartment("IT");
            employee2.setPosition("Programmer");

            // New Employee information.
            employee3.setName("Joy Rogers");
            employee3.setIdNumber(81774);
            employee3.setDepartment("Manufacturing");
            employee3.setPosition("Engineer");

            // Header displayed.
            System.out.println("Name\t\t\tId Number\t\tDepartment\t\tPosition");

            // Employee information displayed.
            System.out.println(employee1.getName()+"\t"+employee1.getIdNumber()+"\t\t\t"+employee1.getDepartment()+"\t\t"+employee1.getPosition());
            System.out.println(employee2.getName()+"\t\t"+employee2.getIdNumber()+"\t\t\t"+employee2.getDepartment()+"\t\t\t\t"+employee2.getPosition());
            System.out.println(employee3.getName()+"\t\t"+employee3.getIdNumber()+"\t\t\t"+employee3.getDepartment()+"\t"+employee3.getPosition());
        }
}
