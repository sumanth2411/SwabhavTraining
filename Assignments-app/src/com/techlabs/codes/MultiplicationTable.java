package com.techlabs.codes;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter number: ");        
		int num=input.nextInt();  
		  
		int i = 1;    
		while (i <= 10)   
		{  
		System.out.println(num + " * " + i + " = "+ num * i);
		i++;  
		}  

	}

}
