package com.techlabs.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<String> list=new LinkedList<String>();
//		list.add("Sumanth");
//		list.add("male");
//		list.add("24");
//		
//		System.out.println(list);
//		list.addFirst("hello");
//		list.addLast("Bye");
//		System.out.println(list);
//		
//		System.out.println(list.size());
		
		LinkedList<Employee> employees=new LinkedList<Employee>();
		Scanner input=new Scanner(System.in);
		
		System.out.println("No.Of Employees:");
		int size=input.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("enter Employee ID:");
			int Id=input.nextInt();
			System.out.println("enter Employee Name:");
			String name=input.next();
			System.out.println("enter Employee Salary:");
			double salary=input.nextDouble();
			
			Employee employee=new Employee(Id,name,salary );
			employees.add(employee);
			
			
		}
		//System.out.println(employees);
		
//		for(Employee employee:employees) {
//			System.out.println(employee);
//		}
		
		Iterator studentIterator=employees.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}

	}

}
