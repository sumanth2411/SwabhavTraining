package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.NewTask;

public class CllableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service=Executors.newFixedThreadPool(5);
		
		List<NewTask> tasks=new ArrayList<NewTask>();
		
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		
		

	}

}
