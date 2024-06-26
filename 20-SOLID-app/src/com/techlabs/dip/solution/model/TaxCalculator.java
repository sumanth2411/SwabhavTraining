package com.techlabs.dip.solution.model;

public class TaxCalculator {
	
	ILogger logger;

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public TaxCalculator(ILogger logger) {
		super();
		this.logger = logger;
	}
	
	 public int calculateTax(int amount, int rate) {
	        int tax = 0;
	        try {
	            tax = amount / rate;
	            System.out.println(tax);
	        } catch (Exception e) {
	            logger.log("Divide by zero");
	        }
	        return tax;
	    }

}
