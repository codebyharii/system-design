package LLD.SOLID.D.WithPrinciple;

public class Computer2 {
    // Depends on abstractions, NOT concrete classes ✔
    private InputDevice  inputDevice;
    private OutputDevice outputDevice;

    // Dependencies injected via constructor (Dependency Injection) ✔
    public Computer2(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice  = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void work() {
        inputDevice.input();
        outputDevice.output();
    }

    /*
     * Solution:
     * Computer2 depends on InputDevice and OutputDevice interfaces.
     * You can swap Keyboard2 with Mouse or Touchpad without touching Computer2.
     * → Follows the Dependency Inversion Principle.
     */
}
