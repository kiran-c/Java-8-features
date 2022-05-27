package com.myjava.java8;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value");
		Double n1 = sc.nextDouble();
				
		System.out.println("Enter the Second value");
		Double n2 = sc.nextDouble();
		
		System.out.println("Enter: 1 for add, 2 for sub, 3 for Div, 4 for Mul");
		Integer option  = sc.nextInt();
		
		Calculator calculator =null;
		Double result = null;
		
		switch (option)
		{
			case 1: 
				
				calculator =  (Double num1, Double num2) -> {
					return num1 + num2;
					};
				
			result = calculator.operation(n1, n2);
			
			break;
			
			case 2:
				
				calculator = (Double num1, Double num2) -> {
					return n1 - n2;  
							
				}; 
				result = calculator.operation(n1, n2);
				break;
		
			
		case 3:  
		
			calculator = (Double n11, Double n22) -> {
				return (n1 / n2);
				};
		
				result = calculator.operation(n1, n2);
				
			break;
		
		case 4:  
		
			calculator = (Double n11, Double n22) -> {
				return (n1 * n2);
				};
		
				result = calculator.operation(n1, n2);
				
			break;
			
		default :
			
			System.out.println("Incorrect Option...! please try again...!");
		}
	
		
		if(result != null)
		{
			System.out.println(result);
		}
		
	}

}