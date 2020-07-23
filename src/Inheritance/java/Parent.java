package Inheritance.java;

import java.util.Scanner;

public class Parent {
	String fname;
	public void MethodOne() {
	Scanner sc=new Scanner(System.in);

		System.out.println("Enter Child's father Name:");
		fname=sc.next();
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

}
