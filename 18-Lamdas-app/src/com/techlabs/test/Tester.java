package com.techlabs.test;

import com.techlabs.model.ITester;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITester test=new ITester() {

			@Override
			public void test1() {
				// TODO Auto-generated method stub
				System.out.println("Testing 1 ......");
			}

			@Override
			public void test2() {
				// TODO Auto-generated method stub
				System.out.println("Testing 2......");
			}
			
		};
		test.test1();
		test.test2();

	}

}
