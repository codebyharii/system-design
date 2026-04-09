package LLD.SOLID.I.WithPrinciple;

// Only implements what it actually needs ✔
public class Car2 implements Drivable {
    @Override
    public void drive() { System.out.println("Car is driving..."); }
}
