package com.techlabs.composite.model;

public class Developer implements IEmployee{
	
	private String name;
	private String position;
	

	public Developer(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name + ", Position: " + position);
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", position=" + position + "]";
	}
	
	

}
