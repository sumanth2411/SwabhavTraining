package com.monocept.arrays2d;

import java.util.Scanner;

public class AdditionOf2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.of rows:");
		int m=input.nextInt();
		System.out.println("enter the no.of colomns:");
		int n=input.nextInt();
		
		int[][] matrix1=new int[m][n];
		int[][] matrix2=new int[m][n];
		
		System.out.println("enter the elements of the first matrix:");
		for (int i = 0; i < m; i++) {
	           for (int j = 0; j < n; j++) {
	                matrix1[i][j] = input.nextInt();
	            }
	        }
		 System.out.println("enter the elements of the second matrix:");
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix2[i][j] = input.nextInt();
	            }
	        }
		 
		 int[][] addmatrix=new int[m][n];
		 for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                addmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
		 System.out.println("Addition of the Matrix:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(addmatrix[i][j] + "\t ");
	            }
	            System.out.println();
	        }
		

	}

}
