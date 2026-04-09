package LLD.SOLID.S.WithPrinciple;

public class Employee2Repository {
    private Employee2 employee;

    public Employee2Repository(Employee2 employee) {
        this.employee = employee;
    }

    // Only ONE responsibility – Database Operations ✔
    public void saveToDatabase() {
        System.out.println("Saving " + employee.getName() + "'s data to the database...");
    }
}
