package com.techlabs.test;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		Scanner input=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=input.nextInt();
		System.out.println("enter second number:");
		int num2=input.nextInt();
		
		double division=num1/num2;
		System.out.println("Division:"+division);
		}
		catch(ArithmeticException e) {
			System.out.println("can not divide by zero,change the num2");
		}
		
		try {
		int num3=Integer.parseInt(args[0]);
		int num4=Integer.parseInt(args[1]);
		
		double division1=num3/num4;
		System.out.println("Division 2:"+division1);
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("enter two numbers");
		}
		finally {
			System.out.println("ThankYou");
		}
		
		

	}

	

}
