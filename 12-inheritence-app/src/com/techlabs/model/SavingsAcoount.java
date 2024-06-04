package com.techlabs.model;

public class SavingsAcoount extends Account{
	private double MinBalance;

	public double getMinBalance() {
		return MinBalance;
	}

	public void setMinBalance(double minBalance) {
		MinBalance = minBalance;
	}
	public void debit(double amount) {
        if (amount > 0) {
            if (getBalance() - amount >= MinBalance) {
                setBalance(getBalance() - amount);
                System.out.println("Debited: " + amount);
            } else {
                System.out.println("Minimum balance requirement not met.");
            }
        } else {
            System.out.println("Amount to be debited should be positive.");
        }
    }

	public SavingsAcoount(int AccountNumber, String Name, double Balance, double minBalance) {
		super(AccountNumber, Name, Balance);
		MinBalance = minBalance;
	}

	@Override
    public String toString() {
        return "SavingsAccount{" +
                "MIN_BALANCE=" + MinBalance +
                ", Account Details=" + super.toString() +
                '}';
    }
	

	

}
