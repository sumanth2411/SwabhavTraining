package com.monocept.arrays2d;

import java.util.Scanner;

public class MultiplicationOf2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.of rows of first matrix:");
		int m1=input.nextInt();
		System.out.println("enter the no.of colomns of first matrix:");
		int n1=input.nextInt();
		
		System.out.println("enter the no.of rows of first matrix:");
		int m2=input.nextInt();
		System.out.println("enter the no.of colomns of first matrix:");
		int n2=input.nextInt();
		
		int[][] matrix1=new int[m1][n1];
		int[][] matrix2=new int[m2][n2];
		
		if (n1 != m2) {
            System.out.println("Cannot multiply matrices with these dimensions.");
            return;
        }
		
		System.out.println("enter the elements of the first matrix:");
		for (int i = 0; i < m1; i++) {
	           for (int j = 0; j < n1; j++) {
	                matrix1[i][j] = input.nextInt();
	            }
	        }
		 System.out.println("enter the elements of the second matrix:");
		 for (int i = 0; i < m2; i++) {
	            for (int j = 0; j < n2; j++) {
	                matrix2[i][j] = input.nextInt();
	            }
	        }
		 
		 int[][] addmatrix=new int[m1][n2];
		 for (int i = 0; i < m1; i++) {
	            for (int j = 0; j < n2; j++) {
	                for (int k = 0; k < n1; k++) {
	                    addmatrix[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
		
		 System.out.println("Multiplication of the Matrix:");
	        for (int i = 0; i < m1; i++) {
	            for (int j = 0; j < n2; j++) {
	                System.out.print(addmatrix[i][j] + "\t ");
	            }
	            System.out.println();
	        }

	}

}
