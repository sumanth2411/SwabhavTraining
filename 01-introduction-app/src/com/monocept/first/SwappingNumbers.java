package com.monocept.first;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=24;
		int num2=18;
		int temp;
		
		temp =num1;
		num1=num2;
		num2=temp;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		int num3=24;
		int num4=18;
		
		num3=num3+num4;
		num4=num3-num4;
		num3=num3-num4;
		System.out.println("num3="+num3);
		System.out.println("num4="+num4);

	}

}
