package Inheritance.java;

import java.util.Arrays;
import java.util.List;

public class A implements InterA,InterB{

	  // if we want to execute the both method (show) of interface
	            // interA and InterB then you must have to override default method
	            // of interA
	@Override 
	public void show() {
		// TODO Auto-generated method stub
		InterA.super.show();
	}
	

	public static void main(String[] args) {
		
		A a1=new A();
		a1.show();
		InterA.message();  //static method
		
		List<Integer>list=Arrays.asList(12,23,32,14,51);
		
		/*for(int i=0;i<list.size();i++)
		{
			System.out.print(" "+list.get(i));
		}*/
		
		/*for(int i:list)
		{
			System.out.print(" "+i);
		}*/
		
		//forEach loop
		
		list.forEach(i->System.out.print(" "+i));
	}

	
}
