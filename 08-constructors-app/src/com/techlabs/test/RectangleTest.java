package com.techlabs.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rectangle1= new Rectangle();
		 
		 Rectangle rectangle2= new Rectangle(10,5);
		 
		 
		 Rectangle rectangle3= new Rectangle(5);
		 
		 System.out.println("the area is:"+rectangle1.getArea());
		 System.out.println("the area is:"+rectangle2.getArea());
		 System.out.println("the area is:"+rectangle3.getArea());
		 
		 

	}

}
