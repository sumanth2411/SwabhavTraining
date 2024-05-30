package com.monocept.scanner;

import java.util.Scanner;

public class SwapScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the first number=");
		int num1=input.nextInt();
		System.out.print("enter the second number=");
		int num2=input.nextInt();
		int temp;
		System.out.println("The actual numbers are num1="+num1+" and num2="+num2);
		temp =num1;
		num1=num2;
		num2=temp;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		System.out.print("enter the first number=");
		int num3=input.nextInt();
		System.out.print("enter the second number=");
		int num4=input.nextInt();
		
		System.out.println("The actual numbers are num1="+num3+" and num2="+num4);
		num3=num3+num4;
		num4=num3-num4;
		num3=num3-num4;
		System.out.println("num3="+num3);
		System.out.println("num4="+num4);

	}

}
