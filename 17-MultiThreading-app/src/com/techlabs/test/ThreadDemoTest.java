package com.techlabs.test;

import com.techlabs.model.MyThread;

public class ThreadDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		MyThread thread1=new MyThread("MyThread1");
		MyThread thread2=new MyThread("MyThread2");
		MyThread thread3=new MyThread("MyThread3");
		
		thread1.setPriority(3);
		thread2.setPriority(9);
		//thread3.setPriority();
		

	}

}
