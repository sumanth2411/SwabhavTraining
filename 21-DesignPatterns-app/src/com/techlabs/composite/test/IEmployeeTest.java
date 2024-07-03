package com.techlabs.composite.test;

import com.techlabs.composite.model.Developer;
import com.techlabs.composite.model.EmployeeDirectory;
import com.techlabs.composite.model.IEmployee;
import com.techlabs.composite.model.Manager;

public class IEmployeeTest {

	 public static void main(String[] args) {
		 IEmployee dev1 = new Developer( "Suyash", "Junior Developer");
	        IEmployee dev2 = new Developer("Mahesh", "Senior Developer");

	        EmployeeDirectory devDirectory = new EmployeeDirectory();
	        devDirectory.addEmployee(dev1);
	        devDirectory.addEmployee(dev2);

	        IEmployee man1 = new Manager( "Dilip", "DotNet Manager");
	        IEmployee man2 = new Manager( "Dinesh", "AWS Manager");

	        EmployeeDirectory manDirectory = new EmployeeDirectory();
	        manDirectory.addEmployee(man1);
	        manDirectory.addEmployee(man2);

	        EmployeeDirectory companyDirectory = new EmployeeDirectory();
	        companyDirectory.addEmployee(devDirectory);
	        companyDirectory.addEmployee(manDirectory);

	        companyDirectory.showEmployeeDetails();
		     
	 }
}
