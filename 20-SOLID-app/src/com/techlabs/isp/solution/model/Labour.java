package com.techlabs.isp.solution.model;

import com.techlabs.isp.violation.model.IWorker;

public class Labour implements IWorker,IHuman{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour starts working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stops working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour starts eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour starts drinking");
	}

}
