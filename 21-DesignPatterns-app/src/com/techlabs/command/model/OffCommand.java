package com.techlabs.command.model;

public class OffCommand implements ICommand{

	private Television tv;
	
	public OffCommand(Television tv) {
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
		tv.off();
	}

}
