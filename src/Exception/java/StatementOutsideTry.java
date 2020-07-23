package Exception.java;

public class StatementOutsideTry {
	
	public static void main(String[] args) {
		 
		try {
			
			System.out.println("statement First");
			System.out.println("statement Second");
			int b=10/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Statement Third");
			int a;
			a=10/0;
		}
		//System.out.println("statement Fourth");
		finally {
			int a;
			a=10/0;
		}
		/*int a;
		a=10/0;*/
	}

}
