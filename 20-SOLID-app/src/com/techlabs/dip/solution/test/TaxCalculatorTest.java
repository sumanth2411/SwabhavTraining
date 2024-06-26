package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.model.DBLogger;
import com.techlabs.dip.solution.model.FileLogger;
import com.techlabs.dip.solution.model.TaxCalculator;


public class TaxCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t1=new TaxCalculator(new DBLogger());
		 t1.calculateTax(10000, 0);

	     t1.setLogger(new FileLogger());
	     t1.calculateTax(1000, 0);
		

	}

}
