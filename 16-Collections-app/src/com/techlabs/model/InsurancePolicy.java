package com.techlabs.model;

import java.util.Date;

public class InsurancePolicy {
	private int policyNumber;
	private String policyHolderName;
	private double amount;
	private Date creationDate;
	public InsurancePolicy(int policyNumber, String policyHolderName, double amount, Date creationDate) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.amount = amount;
		this.creationDate = creationDate;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "InsurancePolicy [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + ", amount="
				+ amount + ", creationDate=" + creationDate + "]";
	}
	
	

}
