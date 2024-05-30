package com.monocept.second;

public class SwappingArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int temp;
		System.out.println("The actual numbers are num1="+num1+" and num2="+num2);
		temp =num1;
		num1=num2;
		num2=temp;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		int num3=Integer.parseInt(args[2]);
		int num4=Integer.parseInt(args[3]);
		
		System.out.println("The actual numbers are num1="+num3+" and num2="+num4);
		num3=num3+num4;
		num4=num3-num4;
		num3=num3-num4;
		System.out.println("num3="+num3);
		System.out.println("num4="+num4);

	}

}
