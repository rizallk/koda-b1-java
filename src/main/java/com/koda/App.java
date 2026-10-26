package com.koda;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        Employee emp1 = new Employee("E001", "Anto", "Senior Fullstack Dev", "IT", 6000000);

        EmployeeService emp1Service = new EmployeeService(emp1);

        System.out.println("================================");
        System.out.println("         Koda Enterprise        ");
        System.out.println("================================");
        emp1Service.showEmployee();

        System.out.println();

        emp1Service.giveRaise(500000);
        emp1Service.showEmployeeCurrentSalary();

        System.out.println();

        emp1Service.giveRaise(-10000000);
        emp1Service.showEmployeeCurrentSalary();
    }
}
