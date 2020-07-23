package Inheritance.java;

public interface InterA {

	default void show() {
		System.out.println("interface A");
	}
	
	static void message()
	{
		System.out.println("static interface ");
	}
}
