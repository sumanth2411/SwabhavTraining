package com.techlabs.test;

import com.techlabs.model.Shape.Circle;
import com.techlabs.model.Shape.Rectangle;
import com.techlabs.model.Shape.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle=new Circle(10);
		circle.area();
		circle.perimeter();
		
		Shape rectangle=new Rectangle(10,20);
		rectangle.area();
		rectangle.perimeter();
		

	}

}
