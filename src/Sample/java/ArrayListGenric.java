package Sample.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListGenric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(12,"vicky"));
		list.add(new Employee(13, "vish"));
		
		/*for(Employee e:list) {
			System.out.println(e.id+":"+e.name);
		}*/
		
		Iterator itr1=list.iterator();
		while(itr1.hasNext()) {
			Employee e1=(Employee)itr1.next();
			System.out.println(e1.id+""+e1.name);
		}
ArrayList <String>al=new ArrayList<>();
al.add("bajaj");
al.add("wipro");
al.add("intel");

for(String str:al)

{
	System.out.println(str);

}
Collections.sort(al);
for(String s:al) {
System.out.println(s);
	}
	

	}}
