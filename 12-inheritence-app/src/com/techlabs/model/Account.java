package com.techlabs.model;

public class Account {
	private double AccountNumber;
	private String Name;
	private double Balance;
	
	public Account(int AccountNumber, String Name, double Balance) {
        this.AccountNumber = AccountNumber;
        this.Name = Name;
        this.Balance = Balance;
    }
	
	public void credit(double amount) {
	        if (amount > 0) {
	            Balance += amount;
	            System.out.println("Credited: " + amount);
	        } else {
	            System.out.println("Amount to be credited should be positive.");
	        }
	    }

	public void debit(double amount) {
	        if (amount > 0) {
	            if (Balance >= amount) {
	                Balance -= amount;
	                System.out.println("Debited: " + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Amount to be debited should be positive.");
	        }
	    }

	public double getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.AccountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		this.Balance = balance;
	}

	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", Name=" + Name + ", Balance=" + Balance + "]";
	}

	

}
