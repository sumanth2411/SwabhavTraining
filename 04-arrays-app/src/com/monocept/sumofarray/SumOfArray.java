package com.monocept.sumofarray;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0;
		int array[];
		array=new int[5];
		System.out.println("Enter the list of arrays:");
		for(int i=0;i<5;i++) {
			array[i]=input.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("the sum of array:"+sum);

	}

}
