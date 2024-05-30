package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first student details:");
		System.out.println("enter the roll number:");
		int rollnumber=input.nextInt();
		student1.setRollnumber(rollnumber);
		System.out.println("enter the name:");
		String name=input.next();
		student1.setName(name);
		System.out.println("enter the age:");
		int age=input.nextInt();
		student1.setAge(age);
		System.out.println("Roll Number:"+student1.getRollnumber());
		System.out.println("Name:"+student1.getName());
		System.out.println("Age:"+student1.getAge());
		
		Student student2=new Student();
		System.out.println("enter the second student details:");
		System.out.println("enter the roll number:");
		rollnumber=input.nextInt();
		student2.setRollnumber(rollnumber);
		System.out.println("enter the name:");
		name=input.next();
		student2.setName(name);
		System.out.println("enter the age:");
		age=input.nextInt();
		student2.setAge(age);
		System.out.println("Roll Number:"+student2.getRollnumber());
		System.out.println("Name:"+student2.getName());
		System.out.println("Age:"+student2.getAge());
		

	}

}
