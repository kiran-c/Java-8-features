package com.mycompany.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOne {

	private static boolean Integer;

	public static void main(String[] args)
	{
		List<Integer> numList = new ArrayList<>();
		
		numList.add(11);
		numList.add(12);
		numList.add(211);
		numList.add(121);
		numList.add(141);
		numList.add(1661);
		
		System.out.println("numList: "+numList);
		
		
		List<Integer> oddNumList = new ArrayList<>();
		
		
		for(Integer num : numList)
		{
			if(num % 2 != 0)
			{
			    oddNumList.add(num);	
			}
			 
		}
		
		System.out.println("List of Odd Numbers :"+oddNumList);
		// JAVA 8
		
		List<Integer> newOddList;
		/*
		 * newOddList = numList.stream().filter((Integer num) -> {return num%2 !=0; })
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println("List of new varaint Odd Numbers :"+newOddList)
		 */;
		 
		 List<Integer> evenList = new ArrayList<>();
		 
		 evenList = numList.stream().filter((num) -> {return num%2 == 0; }).collect(Collectors.toList());
		 System.out.println("new Variant of even List:  "+evenList);
	
		 
		 
		 Predicate<Integer> evenLogic = (num) -> num%2 == 0;
		 Predicate<Integer> gt50 = (num) -> num > 50;
		 
		 List<Integer> evenList2 =  new ArrayList<>();
		 
		 evenList2 = numList.stream().filter(evenLogic).collect(Collectors.toList());
		 System.out.println("Even list using predicate :"+evenList2);
		 
		 List<Integer> list3 =  new ArrayList<>();
		 
		 list3  = numList.stream().filter(gt50.and(evenLogic)).collect(Collectors.toList());
		 
		 
		 System.out.println("Combination of Predicates: "+list3);
		 
	}
}
