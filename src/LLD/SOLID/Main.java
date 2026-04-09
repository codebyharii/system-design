package LLD.SOLID;

import LLD.SOLID.S.WithPrinciple.Employee2;
import LLD.SOLID.S.WithPrinciple.Employee2Repository;
import LLD.SOLID.O.WithPrinciple.*;
import LLD.SOLID.L.WithPrinciple.*;
import LLD.SOLID.I.WithPrinciple.*;
import LLD.SOLID.D.WithPrinciple.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== S: Single Responsibility =====");
        Employee2 emp = new Employee2("Alice", 50000);
        emp.calculateSalary();
        new Employee2Repository(emp).saveToDatabase();

        System.out.println("\n===== O: Open/Closed =====");
        Invoice2 inv = new Invoice2(2500);
        InvoicePrinter pdf   = new PDFInvoicePrinter();
        InvoicePrinter excel = new ExcelInvoicePrinter();
        pdf.print(inv);
        excel.print(inv);

        System.out.println("\n===== L: Liskov Substitution =====");
        Bird2 sparrow = new Sparrow();
        Bird2 ostrich = new Ostrich();
        sparrow.eat();
        ((FlyingBird) sparrow).fly();
        ostrich.eat();

        System.out.println("\n===== I: Interface Segregation =====");
        Drivable car       = new Car2();
        FlyingCar flyingCar = new FlyingCar();
        car.drive();
        flyingCar.drive();
        flyingCar.fly();

        System.out.println("\n===== D: Dependency Inversion =====");
        InputDevice  kb      = new Keyboard2();
        OutputDevice monitor = new Monitor2();
        Computer2    pc      = new Computer2(kb, monitor);
        pc.work();
    }
}
