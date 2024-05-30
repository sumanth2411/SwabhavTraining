package com.techlabs.operations;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=input.nextInt();
		 while(num>0) {
			 int rem=num%10;
			 num=num/10;
			 result=result*10+rem;
		 }
		 System.out.println("The reverse of the entered number is:"+result);

	}

}
