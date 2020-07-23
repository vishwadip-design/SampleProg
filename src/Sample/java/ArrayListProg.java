package Sample.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>(5);
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			Integer i1=(Integer)itr.next();
			System.out.println(i1);
			
		}

	}

}
