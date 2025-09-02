package br.com.mariojp.solid.srp;

public class TaxCalculator {
	private final double rate;
	
	public TaxCalculator() {
        
        String rateStr = System.getProperty("tax.rate", "0.10");
        this.rate = Double.parseDouble(rateStr);
    }
	public double calculateTax(double subtotal) {
        return subtotal * rate;
    }
}
