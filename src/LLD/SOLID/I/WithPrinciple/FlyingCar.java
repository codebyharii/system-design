package LLD.SOLID.I.WithPrinciple;

// Picks exactly the interfaces it needs ✔
public class FlyingCar implements Drivable, Flyable {
    @Override
    public void drive() { System.out.println("FlyingCar is driving..."); }

    @Override
    public void fly()   { System.out.println("FlyingCar is flying..."); }
}
