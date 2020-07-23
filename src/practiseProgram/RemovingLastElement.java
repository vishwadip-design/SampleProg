package practiseProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemovingLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(81);
		al.add(9);
		al.add(16);
		
		int index=al.size()-1;
	       al.remove(index);
		System.out.println(al);
		
		
		
	}

}
