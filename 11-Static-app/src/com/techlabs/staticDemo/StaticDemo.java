package com.techlabs.staticDemo;

public class StaticDemo {
	private int num1;
	private static int num2;
	
	public StaticDemo() {
		num1=0;
		num2=0;
	}
	
	public void increment() {
		num1++;
		num2++;
	}
	
	public void display() {
		System.out.println("number1:"+num1);
		System.out.println("number2:"+num2);
	}

}
