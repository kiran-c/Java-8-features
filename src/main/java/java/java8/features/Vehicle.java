package java.java8.features;

public interface Vehicle {

	
	
	default void show()
	{
		System.out.println("Display...!");
	}
	
	default void show2()
	{
		System.out.println("Display 2...!");
	}
	
	void getDetails();
	String COLOR = "REX";
	Double mileage();
	
	
}
