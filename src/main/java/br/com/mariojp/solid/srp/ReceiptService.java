package br.com.mariojp.solid.srp;

public class ReceiptService {
	private final TaxCalculator taxCalculator = new TaxCalculator();
    private final ReceiptFormatter formatter = new ReceiptFormatter();
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = taxCalculator.calculateTax(subtotal);

        	
        double total = subtotal + tax;

       
        return formatter.formatter(order, subtotal, tax, total);
		
		
	}
}
