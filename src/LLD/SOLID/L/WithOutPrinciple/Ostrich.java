package LLD.SOLID.L.WithOutPrinciple;

public class Ostrich extends Bird {
    @Override
    public void fly() {
        // VIOLATES LSP – substituting Bird with Ostrich breaks expected behaviour
        throw new UnsupportedOperationException("Ostrich cannot fly!");
    }
}
