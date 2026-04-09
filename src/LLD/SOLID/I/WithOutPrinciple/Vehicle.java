package LLD.SOLID.I.WithOutPrinciple;

// Fat interface – VIOLATES ISP
public interface Vehicle {
    void drive();
    void fly();   // not every vehicle can fly
    void sail();  // not every vehicle can sail
}
