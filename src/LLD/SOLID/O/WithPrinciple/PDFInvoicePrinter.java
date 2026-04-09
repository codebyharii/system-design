package LLD.SOLID.O.WithPrinciple;

public class PDFInvoicePrinter implements InvoicePrinter {
    @Override
    public void print(Invoice2 invoice) {
        System.out.println("Printing invoice as PDF... Amount: " + invoice.getAmount());
    }
}
