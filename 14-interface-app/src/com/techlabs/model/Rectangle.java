package com.techlabs.model;

public class Rectangle implements shape{
	private double length;
	private double breadth;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle:"+(length*breadth));
		
		
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of rectangle:"+(2*(length*breadth)));
		
	}
	

}
