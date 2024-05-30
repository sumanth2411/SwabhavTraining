package com.monocept.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] array=new int[8];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
		int[] peakarray=new int[8];
		for(int i=1;i<4;i++) {
			if(array[i]>=array[i-1] && array[i]>=array[i+1]) {
				peakarray[i]=array[i];
			}
		}
		if(array[0]>array[1]) {
			peakarray[0]=array[0];
		}
		if(array[7]>array[6]) {
			peakarray[7]=array[7];
		}
		System.out.println("the peak values are:"+Arrays.toString(peakarray));

	}

}
