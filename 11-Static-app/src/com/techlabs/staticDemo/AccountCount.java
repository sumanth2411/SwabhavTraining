package com.techlabs.staticDemo;

public class AccountCount {
	private double AccountNumber;
	private String Name;
	private double balance;
	
	private static int count=0;
	
	public void increment() {
		count++;
	}
	
	public void display(double AccountNumber, String Name, double balance) {
		System.out.println("Account Number:"+AccountNumber);
		System.out.println("Account holder Name:"+Name);
		System.out.println("Account Balance:"+balance);
		
	}
	
	public void displayNoOfAccounts() {
		System.out.println("the acoounts created is:"+count);
	}
	

}
