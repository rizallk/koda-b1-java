package com.koda;

public class Employee {
  private String employeeId;
  private String name;
  private String position;
  private String department;
  private int salary;

  public Employee(String employeeId, String name, String position, String department, int salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public void showInfo() {
    System.out.println("Employee ID : " + employeeId);
    System.out.println("Name : " + name);
    System.out.println("Position : " + position);
    System.out.println("Department : " + department);
    System.out.println("Salary : Rp " + salary);
  }

  public void showCurrentSalary() {
    System.out.println("Current Salary : Rp " + salary);
  }

  public void increaseSalary(int amount) {
    if (amount <= 0) {
      System.out.println("Error : Kenaikan gaji harus lebih dari 0");
    } else {
      salary += amount;
      System.out.println("Salary Increase : Rp " + amount);
    }

  }
}
