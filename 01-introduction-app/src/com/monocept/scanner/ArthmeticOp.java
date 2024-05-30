package com.monocept.scanner;

import java.util.Scanner;

public class ArthmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the first number=");
		int num1=input.nextInt();
		System.out.print("enter the second number=");
		int num2=input.nextInt();
		
		int sum= num1+num2;
		int sub=num1-num2;
		int multiply=num1*num2;
		int division=num1/num2;
		
		System.out.println("addtion="+sum);
		System.out.println("subtraction="+sub);
		System.out.println("multiplication="+multiply);
		System.out.println("Division="+division);
		
		
		
		
		

	}

}
