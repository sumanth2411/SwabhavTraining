package com.techlabs.model;

public class Rectangle {
	private double width;
	private double height;
	private double area;
	
	public Rectangle() {
		
		this(5,5);
	}
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public Rectangle(double width) {
		this(width,5);
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return this.width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setArea(double area1) {
		
		
		area =this.width*this.height;
		this.area=area;
	}
	public double getArea() {
		return this.area;
	}
	

}
