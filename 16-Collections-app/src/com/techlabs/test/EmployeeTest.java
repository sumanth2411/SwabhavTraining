package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeByName;
import com.techlabs.model.EmployeeBySalary;
import com.techlabs.model.EmployeeComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<Employee>();
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
		
//		Iterator studentIterator=employees.iterator();
//		while(studentIterator.hasNext()) {
//			System.out.println(studentIterator.next());
//		}
//		
//		ListIterator studentListIterator=employees.listIterator();
//		while(studentListIterator.hasNext()) {
//			System.out.println(studentListIterator.next());
//		}
//		while(studentListIterator.hasPrevious()) {
//			System.out.println(studentListIterator.previous());
//		}
//		
		Collections.sort(employees,new EmployeeComparator.EmployeeByName());
		System.out.println(employees);
		
		Collections.sort(employees,new EmployeeComparator.EmployeeBySalary());
		System.out.println(employees);
	

	}

}
