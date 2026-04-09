package LLD.SOLID.D.WithOutPrinciple;

public class Computer {
    // Tightly coupled to concrete classes – VIOLATES DIP
    private Keyboard keyboard;
    private Monitor  monitor;

    public Computer() {
        this.keyboard = new Keyboard();
        this.monitor  = new Monitor();
    }

    public void work() {
        keyboard.type();
        monitor.display();
    }

    /*
     * Problem:
     * Computer depends directly on low-level modules (Keyboard, Monitor).
     * Swapping Keyboard with a different device requires modifying Computer.
     * → Violates the Dependency Inversion Principle.
     */
}
