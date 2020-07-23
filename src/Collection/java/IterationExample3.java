package Collection.java;

import java.util.HashMap;
import java.util.Map;

public class IterationExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,Float> map =new HashMap<String,Float>();
     map.put("sweet", 12.5f);
     map.put("bitter", 13.9f);
     map.put("spicy", 18.5f);
     
     for (Map.Entry<String, Float>entry	 : map.entrySet()) 
     {
	  // returns value and keys
    	 System.out.println(entry.getKey()+" "+entry.getValue());
	}
	}

}
