package LLD.SOLID.O.WithPrinciple;

public class ExcelInvoicePrinter implements InvoicePrinter {
    @Override
    public void print(Invoice2 invoice) {
        System.out.println("Printing invoice as Excel... Amount: " + invoice.getAmount());
    }
}
