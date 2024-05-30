package com.techlabs.operations;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int sum = 0;
        int originalNumber = num;

        while (num> 0) {
            int digit = num % 10; 
            sum =sum+ digit; 
            num =num/ 10; 
        }

        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);

	}

}
