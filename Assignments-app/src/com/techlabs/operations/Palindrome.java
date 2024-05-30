package com.techlabs.operations;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=input.nextInt();
		int rev=0;
		int temp=num;
		while(temp>0) {
			int rem= temp%10;
			temp=temp/10;
			rev=rev*10+rem;
			
		}
		if(num==rev) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given is not palindrome");
		}

	}

}
