package com.techlabs.dip.solution.model;

public class DBLogger implements ILogger{

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("Logged to database: " + err);
	}

}
