package com.techlabs.secondlargest;

import java.util.Scanner;

public class FindingSecondLargest {

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

        int largest = 0;
        int secondLargest = 0;

        for (int num : array) {
            if (largest == 0 || num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num != largest && (secondLargest == 0 || num > secondLargest)) {
                secondLargest = num;
            }
        }

        if (secondLargest == 0) {
            System.out.println("The array does not have enough distinct elements.");
        } 
        else {
            System.out.println("The second largest element is: " + secondLargest);
        }

	}

}
