package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Rectangle rectangle1=new Rectangle();
		System.out.println("enter the value of height:");
		int height=input.nextInt();
		rectangle1.setHeight(height);
		System.out.println("enter the value of width:");
		int width=input.nextInt();
		rectangle1.setWidth(width);
		int area=height*width;
		rectangle1.setArea(area);
		
		System.out.println("Height:"+rectangle1.getHeight());
		System.out.println("Width:"+rectangle1.getWidth());
		System.out.println("Area:"+rectangle1.getArea());
		
		
		

	}

}
