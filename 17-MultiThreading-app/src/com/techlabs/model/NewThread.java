package com.techlabs.model;

public class NewThread implements Runnable{
	private Thread thread;
	
	

	public NewThread(String name) {
		this.thread =new Thread(this,name);
		thread.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	

}
