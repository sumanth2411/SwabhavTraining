package com.techlabs.ocp.voilation.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestiavalType festival;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestiavalType getFestival() {
		return festival;
	}
	public void setFestival(FestiavalType festival) {
		this.festival = festival;
	}
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestiavalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	
	public double calculateSimpleIntrest() {
		
		return principal*duration*interestRate()/100;
	}
	
	private double interestRate() {
		if(festival==festival.NEW_YEAR)
			return 8;
		if(festival==festival.DIWALI)
			return 8.5;
		if(festival==festival.HOLI)
			return 7.5;
		return 6.5;
	}
	

}
