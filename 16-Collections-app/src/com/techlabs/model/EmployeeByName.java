package com.techlabs.model;

import java.util.Comparator;

public class EmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getName().compareTo(employee2.getName());
	}

}
