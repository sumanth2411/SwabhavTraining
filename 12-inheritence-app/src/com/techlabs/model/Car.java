package com.techlabs.model;

public class Car extends FourWheeler {
	
	public Car(String companyName, double mileage, double price) {
		super(companyName, mileage);
		this.price = price;
	}
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	 public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Price: " + price);
	    }

}
