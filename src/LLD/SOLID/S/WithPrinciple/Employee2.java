package LLD.SOLID.S.WithPrinciple;

public class Employee2 {
    private String name;
    private double salary;

    public Employee2(String name, double salary) {
        this.name   = name;
        this.salary = salary;
    }

    public String getName()   { return name; }
    public double getSalary() { return salary; }

    // Only ONE responsibility – Business Logic ✔
    public void calculateSalary() {
        System.out.println("Calculating salary for " + name + "...");
    }
}
