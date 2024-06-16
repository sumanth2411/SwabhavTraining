package com.techlabs.model;

public class Audio implements Playable{
	
	public Audio(String title) {
		super();
		this.title = title;
	}

	private String title;

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play the "+title+" audio song");
		
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause the "+title+" audio song");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop the "+title+" audio song");
		
	}
	

}
