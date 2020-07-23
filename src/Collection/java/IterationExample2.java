package Collection.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		List l=new ArrayList();
		l.add(2);
		l.add(4);
		System.out.println(l.get(3));
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("MH", "mumbai");
		map.put("GJ", "gandhinagar");
		map.put("TS", "hyderbad");
		
		for (String state : map.keySet()) {
			System.out.println("state:"+state);
		}
		for (String city : map.values()) {
			System.out.println("capital:"+city);
		}
	}

}
