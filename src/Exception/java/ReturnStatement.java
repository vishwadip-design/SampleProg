package Exception.java;

public class ReturnStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(m1());
		
		// always print the return value of finally block first

	}
public static int m1()
{
	try {
		System.out.println("statement first");
		return 999;
		
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		System.out.println("statement Third");
		return 777;
	}
}
}
