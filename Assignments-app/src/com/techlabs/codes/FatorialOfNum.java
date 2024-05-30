package com.techlabs.codes;

import java.util.Scanner;

public class FatorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the num:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int i=1;
		int fact=1;
		 while( i <= num ){  
	            fact = fact * i;   
	            i++;  
	        }     
		 System.out.println("Factorial of " + num + " is: " + fact);
		

	}

}
