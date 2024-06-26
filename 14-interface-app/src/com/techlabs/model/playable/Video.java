package com.techlabs.model.playable;

public class Video implements Playable{

	private String title;
	private String resolution;
	public Video(String title, String resolution) {
		super();
		this.title = title;
		this.resolution = resolution;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play the "+title+" video in "+resolution);
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause the "+title+" video in "+resolution);
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop the "+title+" video in "+resolution);
	}
	
}
