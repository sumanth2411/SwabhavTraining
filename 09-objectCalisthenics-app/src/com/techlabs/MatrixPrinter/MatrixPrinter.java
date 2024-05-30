package com.techlabs.MatrixPrinter;

import java.util.Scanner;

public class MatrixPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int matrix[][]=new int[3][3];
		System.out.println("enter the elements:");
		createRows(matrix, input);
		displayMatrix(matrix);
		

	}

	private static void createRows(int[][] matrix, Scanner input) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			createColumns(i,matrix,input);
		}
		
	}

	private static void createColumns(int i, int[][] matrix, Scanner input) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++) {
			matrix[i][j]=input.nextInt();
		}
	}

}
