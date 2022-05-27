package java.java8.features;

@FunctionalInterface
public interface FunctionalInterfaces {

	void display();
	
	//void display2();
	
	static void staticFunc()
	{
		System.out.println("Static Func...!");
	}
	
	default void defaultFunc1()
	{
		
	}
	
	default void defaultFunc2()
	{
		
	}
	
	default void defaultFunc3()
	{
		
	}
	
	
}
