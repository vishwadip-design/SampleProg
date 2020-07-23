package B;

public class ChildParent extends Child{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChildParent cp=new ChildParent();
		Child cp=new ChildParent();
		
		
		System.out.println("Enter Srudent Information:");
		cp.methodTwo();
		cp.MethodOne();
		
		System.out.println("First_name:"+cp.Child_fname+"Child Lname:"+cp.Child_lname+"Middle_Name:"+cp.fname);

	}

}
