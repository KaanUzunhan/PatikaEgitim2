public class Main {
    public static void main(String[] args) {
        // Employee is class name first is the object name and rest of all parameters
        // All data taken from the user
        Employee first = new Employee("Kaan",2000,45,2002);

        // These methods called from the class thanks for watching...
        // I did not use the toString method because I don't need
        first.employeeParameters();
        first.printTaxes();
        first.salaryRaise();
        first.printBonus();
        first.EmployeeSalary();
        first.printSalaryRaise();

        // Grup ödevi

    }
}