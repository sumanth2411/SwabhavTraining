package com.techlabs.examplecodes;

public class CalculatorAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=24;
		int num2=18;
		
		int sum=addition(num1,num2);
		double avg=average(sum);
		
		System.out.println("average="+avg);

	}
	private static int addition(int num1,int num2) {
		return num1+num2;
	}
	
	private static double average(int sum) {
		return sum/2;
	}

}
