package Sample.java;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		if(e1.id>e2.id)
		return 1;
		else if (e1.id<e2.id) {
			return -1;
		}
		else return 0;
	}

/*	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1<i2) {
			return +1;
		}else if (i1>i2) {
			return -1;
		}else
		return 0;
	}*/
	

}
