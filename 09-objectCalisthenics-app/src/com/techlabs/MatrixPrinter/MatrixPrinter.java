package com.techlabs.MatrixPrinter;

import java.util.Scanner;

public class MatrixPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]=new int[3][3];
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter elements of matrix");
		createRows(matrix,scanner);
		System.out.println("array elements are");
		createRows1(matrix,scanner);

	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			createColumns(i,matrix,scanner);
		}
		
	}

	private static void createColumns(int i, int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++)
		{
			matrix[i][j]=scanner.nextInt();
		}
		
	}
	private static void createRows1(int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			createColumns1(i,matrix,scanner);
			System.out.println();
		}
		
	}

	private static void createColumns1(int i, int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++)
		{
			System.out.print(matrix[i][j]+" ");
			
		}
		
	}

}
