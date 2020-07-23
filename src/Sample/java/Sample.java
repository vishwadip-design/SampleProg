package Sample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add(null);
		//list.add(3);
		
		
	Iterator itr=list.iterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
		  System.out.println(s);
		  
		  }
		int a[]= {12,14,15,17};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 14));
		}
	}


