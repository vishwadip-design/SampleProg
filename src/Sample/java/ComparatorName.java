package Sample.java;

import java.util.Comparator;

public class ComparatorName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		return e1.name.compareTo(e2.name);
	}

	
}
