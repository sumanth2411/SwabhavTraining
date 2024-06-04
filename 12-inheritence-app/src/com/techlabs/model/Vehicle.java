package com.techlabs.model;

public class Vehicle {
	private String CompanyName;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	
	public void displayDetails() {
        System.out.println("Company Name: " + CompanyName);
    }

	public Vehicle(String companyName) {
		super();
		CompanyName = companyName;
	}

}
