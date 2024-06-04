package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight boxWeight=new BoxWeight(30,40,60,50);
		
		
		System.out.println("depth:"+boxWeight.getDepth());
		System.out.println("Width:"+boxWeight.getWidth());
		System.out.println("Height:"+boxWeight.getHeight());
		System.out.println("Weight:"+boxWeight.getWeight());
		
		

	}

}
