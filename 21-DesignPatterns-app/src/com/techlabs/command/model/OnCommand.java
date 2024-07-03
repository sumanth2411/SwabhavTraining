package com.techlabs.command.model;

public class OnCommand implements ICommand{

	private Television tv;
	
	
	public OnCommand(Television tv) {
		super();
		this.tv = tv;
	}

	public Television getTv() {
		return tv;
	}

	public void setTv(Television tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}
	
	

}
