package com.techlabs.test;

import java.util.function.BiConsumer;

public class BiConSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> biConsumer=(num1,num2)->{
			int temp;
			temp=num1;
			num1=num2;
			num2=temp;
			System.out.println("Swapped numbers:"+num1+" and "+num2);
		};
		biConsumer.accept(20, 30);

	}

}
