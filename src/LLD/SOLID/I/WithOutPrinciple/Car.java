package LLD.SOLID.I.WithOutPrinciple;

public class Car implements Vehicle {
    @Override
    public void drive() { System.out.println("Car is driving..."); }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car cannot fly!"); // forced – VIOLATES ISP
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Car cannot sail!"); // forced – VIOLATES ISP
    }
}
