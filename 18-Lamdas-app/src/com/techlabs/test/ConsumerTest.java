package com.techlabs.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer=(arg)-> System.out.println(arg);
		
		consumer.accept(50);
		
		BiConsumer<Integer,Integer> biConsumer=(num1,num2)-> System.out.println("the addition:"+(num1+num2));

		biConsumer.accept(20, 30);
	}

}
