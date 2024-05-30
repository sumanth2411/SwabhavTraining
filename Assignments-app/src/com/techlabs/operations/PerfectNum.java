package com.techlabs.operations;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=input.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("The given num is a perfect number");
		}
		else {
			System.out.println("The given num is not a perfect number");
		}

	}

}
