package com.monocept.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the range of elements:");
		int n=input.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
		int temp=1;
		int[] product=new int[n];
		for (int i = 0; i < n; i++) {
            product[i] = 1;
            if(array[i]!=0) {
            	 temp=array[i]*temp;
            }
        }

		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				product[i]=temp/array[i];
			}
			else {
				product[i]=temp;
			}
		}
		System.out.println("the required array is:"+Arrays.toString(product));

	}

}
