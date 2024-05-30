package com.techlabs.model;

public class Complex {
	private int real;
	private int imaginary;
	private int sum;
	
	public Complex(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public void setReal(int real) {
		this.real=real;
	}
	public int getReal() {
		return this.real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary=imaginary;
	}
	public int getImaginary() {
		return this.imaginary;
	}
	
}
