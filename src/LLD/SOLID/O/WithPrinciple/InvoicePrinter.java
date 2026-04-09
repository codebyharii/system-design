package LLD.SOLID.O.WithPrinciple;

// Abstraction – closed for modification, open for extension ✔
public interface InvoicePrinter {
    void print(Invoice2 invoice);
}
