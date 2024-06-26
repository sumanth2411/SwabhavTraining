package com.techlabs.isp.violation.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour starts working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour Stops working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour Starts eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour starts drinking");
	}
	

}
