package com.techlabs.isp.solution.test;

import com.techlabs.isp.solution.model.IWroker;
import com.techlabs.isp.violation.model.IWorker;
import com.techlabs.isp.violation.model.Labour;
import com.techlabs.isp.violation.model.Robot;

public class IWorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Labour labour=new Labour();
		labour.startWork();
		labour.stopWork();
		labour.drink();
		labour.eat();
		
		Robot robot=new Robot();
		robot.startWork();
		robot.stopWork();
		
	}

}
