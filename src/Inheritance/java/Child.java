package Inheritance.java;

import java.util.Scanner;

public class Child extends Parent{
	
	String Child_fname;
	String Child_lname;
	public String getChild_fname() {
		return Child_fname;
	}
	public void setChild_fname(String child_fname) {
		Child_fname = child_fname;
	}
	public String getChild_lname() {
		return Child_lname;
	}
	public void setChild_lname(String child_lname) {
		Child_lname = child_lname;
	}
	public void methodTwo() {
	
	
		
		Scanner sc=new Scanner(System.in);
		Child ch=new Child();
		
		
		System.out.println("Student First name:");
		 Child_fname=sc.next();
		
		System.out.println("Child last Name:");
		Child_lname=sc.next();
		
		
		
		
	}

}
