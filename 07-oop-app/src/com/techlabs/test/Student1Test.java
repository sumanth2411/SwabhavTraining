package com.techlabs.test;

import java.util.Scanner;


import com.techlabs.model.Student1;

public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.of students:");
		int n=input.nextInt();
		Student1 student[]=new Student1[n];
		for(int i=0;i<student.length;i++) {
			student[i]=new Student1();
			System.out.println("enter the roll number:");
			student[i].setRollNumber(input.nextInt());
			System.out.println("enter the name:");
			student[i].setName(input.next());
			System.out.println("enter the age:");
			student[i].setAge(input.nextInt());
			System.out.println("enter the Email id:");
			student[i].setEmailId(input.next());
			
			
		}
		
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
			
		}
		
		
		

	}

}
