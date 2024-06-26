package com.techlabs.test;

import com.techlabs.model.Caller;
import com.techlabs.model.Callme;

public class CallerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Callme target=new Callme();
		
		Caller caller1=new Caller("Hello",target);
		Caller caller2=new Caller("SaiSumanth",target);
		Caller caller3=new Caller("Bye",target);
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("THread Interrupted");
		}
	}

}
