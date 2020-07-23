package Collection.java;

import java.util.HashMap;
import java.util.Map;

public class IterationExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String, String>map=new HashMap<String, String>();
       map.put("plant", "Nimb");
       map.put("Animal", "Lion");
       map.put("Person", "vicky");
       
       map.forEach((k,v)->System.out.println("Name:"+k+"\tvalue:"+v));
	}

}
