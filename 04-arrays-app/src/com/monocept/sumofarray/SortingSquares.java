package com.monocept.sumofarray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] array=new int[5];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
		
		int[] squareofarray=new int[5];
		for(int i=0;i<array.length;i++) {
			squareofarray[i]=array[i]*array[i];
		}
		Arrays.sort(squareofarray); 
		for(int i=0;i<array.length;i++) {
		}
		System.out.println("the squares of the given array are:"+Arrays.toString(squareofarray));
		
		
		
		

	}

}
