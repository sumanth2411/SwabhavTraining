package com.techlabs.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id1) {
		id=id1;
	}
	public void setName(String name1) {
		name=name1;
	}
	public void setSalary(double salary2) {
		salary=salary2;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}

}
