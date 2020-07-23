package Collection.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class SortHashMapByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap=new HashMap<>();
		hmap.put(16, "pune");
		hmap.put(12, "Mumbai");
		hmap.put(11, "Nagpur");
		hmap.put(14, "Latur");
		
		Iterator<Integer>itr=hmap.keySet().iterator();
		
		while(itr.hasNext()) 
		{
			
			int number=(Integer)itr.next();
			System.out.println("Rollnumber:"+number+" City:"+hmap.get(number));
		}
		
		// using treemap now
		
		System.out.println("--------TREEMAP Sorting--------------");
		
		TreeMap<Integer, String>tm=new TreeMap<>(hmap);
		
		Iterator<Integer>itr1=tm.keySet().iterator();
		
		while(itr1.hasNext())
		{
			
			int number1=(Integer)itr1.next();
			System.out.println("ROllnumber:"+number1+"\t city:"+hmap.get(number1));
		}
	}

}
