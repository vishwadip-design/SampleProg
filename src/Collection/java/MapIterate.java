package Collection.java;

import java.util.HashMap;
import java.util.Iterator;

public class MapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>hm=new HashMap<>();
		hm.put("v", 1);
		hm.put("i", 2);
		hm.put("c", 3);
		hm.put("k", 4);
		
		Iterator<String> itr=hm.keySet().iterator();
		
		while (itr.hasNext()) {
	      String key=(String)itr.next();
	      
	      System.out.println("Name: "+key+" Number:"+hm.get(key));
			
		}
	}

}
