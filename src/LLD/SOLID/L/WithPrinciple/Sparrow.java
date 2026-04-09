package LLD.SOLID.L.WithPrinciple;

public class Sparrow extends Bird2 implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating seeds...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
