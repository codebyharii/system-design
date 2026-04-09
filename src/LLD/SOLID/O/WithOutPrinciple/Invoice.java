package LLD.SOLID.O.WithOutPrinciple;

public class Invoice {
    private double amount;

    public Invoice(double amount) { this.amount = amount; }

    public double getAmount() { return amount; }

    // Every new format needs an edit here → VIOLATES OCP
    public void printInvoice(String format) {
        if (format.equals("PDF")) {
            System.out.println("Printing invoice as PDF...");
        } else if (format.equals("Excel")) {
            System.out.println("Printing invoice as Excel...");
        }
        /*
         * Problem: Adding HTML format means modifying this method.
         * Violates the Open/Closed Principle.
         */
    }
}
