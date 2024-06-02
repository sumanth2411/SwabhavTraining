package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight boxWeight=new BoxWeight();
		
		boxWeight.setDepth(30);
		boxWeight.setWidth(50);
		boxWeight.setHeight(40);
		boxWeight.setWeight(60);
		
		System.out.println("depth:"+boxWeight.getDepth());
		System.out.println("Width:"+boxWeight.getWidth());
		System.out.println("Height:"+boxWeight.getHeight());
		System.out.println("Weight:"+boxWeight.getWeight());
		
		

	}

}
