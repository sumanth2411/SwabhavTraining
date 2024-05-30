package com.techlabs.model;

public class Student {
	private int rollnumber;
	private String name;
	private int age;
	
	public void setRollnumber(int rollnumber1) {
		rollnumber=rollnumber1;
	}
	public void setName(String name1) {
		name=name1;
	}
	public void setAge(int age1) {
		age=age1;
	}
	
	public int getRollnumber(){
		return rollnumber;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

}
