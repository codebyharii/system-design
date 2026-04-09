package LLD.SOLID.L.WithPrinciple;

// Ostrich extends Bird2 but does NOT implement FlyingBird – no violation ✔
public class Ostrich extends Bird2 {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating grass...");
    }
}
