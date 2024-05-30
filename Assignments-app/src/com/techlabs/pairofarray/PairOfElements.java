package com.techlabs.pairofarray;

import java.util.Scanner;

public class PairOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = input.nextInt();
	        if (size < 2) {
	            System.out.println("The array does not have enough elements.");
	            input.close();
	            return;
	        }

	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            array[i] = input.nextInt();
	        }

	        int sum = 0;
	        for (int i = 0; i < size; i++) {
	            sum += array[i];
	        }

	        double average = (double) sum / size;
	        
	        boolean pairExists = false;
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = i + 1; j < size; j++) {
	                double pairSum = array[i] + array[j];
	                if (pairSum == average ) {
	                    pairExists = true;
	                    break;
	                }
	            }
	            if (pairExists) {
	                break;
	            }
	        }

	        if (pairExists) {
	            System.out.println("Yes, there exists a pair whose sum equals the average of all elements.");
	        } else {
	            System.out.println("No, there does not exist a pair whose sum equals the average of all elements.");
	        }



	}

}
