package com.myjava.java8;

@FunctionalInterface
public interface IamFunctionalInterface {

	//void display();
	
	void display(Integer i);
	
	
	static void staticFunc()
	{
		System.out.println("Static Func called....!");
	}
}
