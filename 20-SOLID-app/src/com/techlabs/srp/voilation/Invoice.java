package com.techlabs.srp.voilation;

public class Invoice {

	private int id;
	private String description;
	private double amount ;
	private double tax;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public Invoice(int id, String description, double amount) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = 0;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public void calculateTax() {
		 this.tax = this.amount * 0.10;
		
	}
	
	 public void printInvoice() {
	        System.out.println("Invoice ID: " + id);
	        System.out.println("Description: " + description);
	        System.out.println("Amount: " + amount);
	        System.out.println("Tax: " + tax);
	      
	    }
	

}
