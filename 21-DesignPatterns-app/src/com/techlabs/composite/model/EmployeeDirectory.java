package com.techlabs.composite.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee{

	private List<IEmployee> employees;
	
	 public void addEmployee(IEmployee employee) {
	        employees.add(employee);
	    }
	 
	 public void removeEmployee(IEmployee employee) {
	        employees.remove(employee);
	    }
	 
	 
	
	public EmployeeDirectory() {
		super();
		this.employees = new ArrayList<>();
	}

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		 for (IEmployee employee : employees) {
	            employee.showEmployeeDetails();
	        }
		
	}

}
