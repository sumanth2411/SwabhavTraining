package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape circle=new Circle(10);
		circle.area();
		circle.perimeter();
		
		shape rectangle=new Rectangle(10,20);
		rectangle.area();
		rectangle.perimeter();
		

	}

}
