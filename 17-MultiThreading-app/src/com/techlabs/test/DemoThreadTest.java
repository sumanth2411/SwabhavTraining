package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class DemoThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service =Executors.newFixedThreadPool(10);
		
		for(int i=0;i<1000;i++) {
			service.execute(new Task());
		}
		
	}

}
