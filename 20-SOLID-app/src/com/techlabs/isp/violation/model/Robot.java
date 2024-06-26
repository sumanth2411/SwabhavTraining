package com.techlabs.isp.violation.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot starts working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot Stops working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot Starts eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot starts drinking");
	}

}
