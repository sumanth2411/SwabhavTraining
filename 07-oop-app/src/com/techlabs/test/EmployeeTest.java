package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first employee details:");
		System.out.println("enter the id number:");
		int id=input.nextInt();
		employee1.setId(id);
		System.out.println("enter the name:");
		String name=input.next();
		employee1.setName(name);
		System.out.println("enter the salary:");
		double salary=input.nextInt();
		employee1.setSalary(salary);
		System.out.println("Employee id:"+employee1.getId());
		System.out.println("Employee name:"+employee1.getName());
		System.out.println("Employee Salry:"+employee1.getSalary());
		
		Employee employee2=new Employee();
		System.out.println("enter the second employee details:");
		System.out.println("enter the id number:");
		id=input.nextInt();
		employee2.setId(id);
		System.out.println("enter the name:");
		name=input.next();
		employee2.setName(name);
		System.out.println("enter the salary:");
		salary=input.nextInt();
		employee2.setSalary(salary);
		System.out.println("Employee id:"+employee2.getId());
		System.out.println("Employee name:"+employee2.getName());
		System.out.println("Employee Salry:"+employee2.getSalary());
		
		

	}

}
