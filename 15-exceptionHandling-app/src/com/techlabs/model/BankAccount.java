package com.techlabs.model;

import com.techlabs.Exceptions.InsufficientFundsException;
import com.techlabs.Exceptions.NegativeAmountException;

public class BankAccount {
	private double amount;
	private double balance;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(double amount, double balance) {
		super();
		this.amount = amount;
		this.balance = balance;
	}
	public void deposit() {
		if(amount<0) {
			throw new NegativeAmountException();
		}
		balance+=amount;
		System.out.println("the amount deposited");
	}
	public void withDraw() {
		if(balance<amount) {
			throw new InsufficientFundsException();
		}
		balance-=amount;
		System.out.println("the amount is withdrawn");
		
	}

}
