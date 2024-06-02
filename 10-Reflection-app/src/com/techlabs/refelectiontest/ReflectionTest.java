package com.techlabs.refelectiontest;

import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class stringClass=Class.forName("java.lang.String");
			
			Method methods[]=stringClass.getMethods();
			for(Method method:methods) {
				
				System.out.println(method.getName()+"\t"+method.getParameterCount());
				
			}

		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
