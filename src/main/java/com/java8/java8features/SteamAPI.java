package com.java8.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SteamAPI {

	public static void main(String[] args)
	{
		List<Integer> numList = new ArrayList<>();
		numList.add(11);
		numList.add(12);
		numList.add(211);
		numList.add(141);
		numList.add(1661);
	
		System.out.println(numList);
		List<Integer> OddNumList = new ArrayList<>();
		
		for(Integer num : numList)
		{
			if((num%2) != 0 )
			{
				System.out.println(num);
				OddNumList.add(num);
			}
		}
	
		System.out.println(OddNumList);
		// JAVA 8
		
	 OddNumList = 	numList.stream().filter((num) -> {return num%2 !=0;}).collect(Collectors.toList());
	System.out.println(OddNumList);	
	
	Predicate<Integer> oddLogic = num -> num%2 !=0;
	Predicate<Integer> evenLogic = num -> num%2 ==0;
	OddNumList = numList.stream().filter(evenLogic).collect(Collectors.toList());	

	
	
	
	
	OddNumList = numList.stream().filter(oddLogic).collect(Collectors.toList());	
	
	}
	

	
	
}
