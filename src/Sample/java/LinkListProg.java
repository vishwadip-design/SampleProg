package Sample.java;

import java.util.LinkedList;

public class LinkListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link=new LinkedList<>();
		link.add("A");
		link.add(3);
		link.add("apple");
		System.out.println(link);
		System.out.println("add element to first position");
		link.addFirst("Z");
		System.out.println("after adding element");
		System.out.println(link);
		System.out.println("remove last element");
		link.removeLast();
		System.out.println(link);
	}

}
