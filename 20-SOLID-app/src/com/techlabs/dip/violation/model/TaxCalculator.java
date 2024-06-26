package com.techlabs.dip.violation.model;

public class TaxCalculator {
	
	DBLogger dblogger;
	
	 public TaxCalculator() {
	        this.dblogger = new DBLogger();
	    }

	 public int calculateTax(int amount, int rate) {
	        int tax = 0;
	        try {
	            tax = amount / rate;
	            System.out.println(tax);
	        } catch (Exception e) {
	            dblogger.log("Divide by zero");
	        }
	        return tax;
	    }
}
