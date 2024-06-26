package com.techlabs.test;

import com.techlabs.model.Consumer;
import com.techlabs.model.Producer;
import com.techlabs.model.Q;

public class PCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press control-c stop.");
		
	}

}
