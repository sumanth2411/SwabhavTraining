package com.techlabs.model;

public class CurrentAccount extends Account{
	private double OverDraftLimit;

	public double getOverDraftLimit() {
		return OverDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		OverDraftLimit = overDraftLimit;
	}
	public void debit(double amount) {
        if (amount > 0) {
            if (getBalance() + OverDraftLimit >= amount) {
                setBalance(getBalance() - amount);
                System.out.println("Debited: " + amount);
            } else {
                System.out.println("Overdraft limit exceeded.");
            }
        } else {
            System.out.println("Amount to be debited should be positive.");
        }
    }

	public CurrentAccount(int AccountNumber, String Name, double Balance, double overDraftLimit) {
		super(AccountNumber, Name, Balance);
		OverDraftLimit = overDraftLimit;
	}

	 @Override
	    public String toString() {
	        return "CurrentAccount{" +
	                "OverDraftLimit=" + OverDraftLimit +
	                ", Account Details=" + super.toString() +
	                '}';
	    }

	

}
