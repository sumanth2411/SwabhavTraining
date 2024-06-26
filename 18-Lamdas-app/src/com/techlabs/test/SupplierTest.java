package com.techlabs.test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> supply=()->{
			Random random=new Random();
			return random.nextInt();
		};
		System.out.println("Random number="+supply.get());

	}

}
