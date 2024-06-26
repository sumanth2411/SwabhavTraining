package com.monocept.arrays2d;

import java.util.Scanner;

public class MultiplicationOf2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.of rows of first matrix:");
		int row1=input.nextInt();
		System.out.println("enter the no.of colomns of first matrix:");
		int column1=input.nextInt();
		
		System.out.println("enter the no.of rows of second matrix:");
		int row2=input.nextInt();
		System.out.println("enter the no.of colomns of second matrix:");
		int column2=input.nextInt();
		
		int[][] matrix1=new int[row1][column1];
		int[][] matrix2=new int[row2][column2];
		
		if (column1 != row2) {
            System.out.println("Cannot multiply matrices with these dimensions.");
            return;
        }
		
		System.out.println("enter the elements of the first matrix:");
		for (int i = 0; i < row1; i++) {
	           for (int j = 0; j < column1; j++) {
	                matrix1[i][j] = input.nextInt();
	            }
	        }
		 System.out.println("enter the elements of the second matrix:");
		 for (int i = 0; i < row2; i++) {
	            for (int j = 0; j < column2; j++) {
	                matrix2[i][j] = input.nextInt();
	            }
	        }
		 
		 int[][] addmatrix=new int[row1][column2];
		 for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < column2; j++) {
	                for (int k = 0; k < column1; k++) {
	                    addmatrix[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
		
		 System.out.println("Multiplication of the Matrix:");
	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < column2; j++) {
	                System.out.print(addmatrix[i][j] + "\t ");
	            }
	            System.out.println();
	        }

	}

}
