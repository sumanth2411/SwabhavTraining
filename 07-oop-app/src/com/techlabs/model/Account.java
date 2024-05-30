package com.techlabs.model;

public class Account {
	private double accountNumber;
	private AccountType accountType;
	private String name;
	private float balance;
	public Account(double accountNumber, AccountType accountType, String name, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.name = name;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "accountNumber=" + accountNumber + ", accountType=" + accountType + ", name=" + name
				+ ", balance=" + balance + "";
	}
	
	
	
	

}
