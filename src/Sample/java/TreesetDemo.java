package Sample.java;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(5);
		System.out.println(t);
	}

}
