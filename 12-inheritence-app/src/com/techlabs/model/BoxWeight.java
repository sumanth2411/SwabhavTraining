package com.techlabs.model;

public class BoxWeight extends Box {
	
	private double width;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public BoxWeight(double depth, double height, double weight, double width) {
		super(depth, height, weight);
		this.width = width;
	}

	

}
