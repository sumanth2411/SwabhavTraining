package com.techlabs.model;

public class Circle implements shape{
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of circle:"+(3.14*radius*radius));
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimenter of Circle:"+(2*3.14*radius));
		
	}
	

}
