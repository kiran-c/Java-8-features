package com.myjava.java8;

public class MainClass {

	public static void main(String[] args)
	{
		Integer x = 6;
		
		//IamFunctionalInterface iaf = () -> {System.out.println("Display....!");};
		//iaf.display();
		IamFunctionalInterface iaf = (Integer i) -> {System.out.println("Show: "+i);};
		iaf.display(10);
		
	}
}