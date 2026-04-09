package LLD.SOLID.S.WithOutPrinciple;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name   = name;
        this.salary = salary;
    }

    public String getName()   { return name; }
    public double getSalary() { return salary; }

    // Responsibility 1 – Business Logic
    public void calculateSalary() {
        System.out.println("Calculating salary...");
    }

    // Responsibility 2 – Database Operations   ← VIOLATES SRP
    public void saveToDatabase() {
        System.out.println("Saving employee data to the database...");
    }

    /*
     * Problem:
     * This class has TWO responsibilities:
     *   1. Business logic for employee salary.
     *   2. Database operations.
     * → Violates the Single Responsibility Principle.
     */
}
