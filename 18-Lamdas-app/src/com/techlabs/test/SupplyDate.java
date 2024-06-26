package com.techlabs.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class SupplyDate {

	public static void main(String[] args) {
		// TODO Auto-geSupplier<T>method stub

		Supplier<Date> supply=()->{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		    Date date = new Date();  
			return date;
		};
		System.out.println("Todays date:"+supply.get());
	}

}
