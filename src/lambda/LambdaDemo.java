package lambda;

public class LambdaDemo {

	interface  demo{
		
		void message();
	}
	
class DamOne implements demo{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Message Print");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo d1;
	/*	d1=new DamOne();
		d1.message();*/
		
		d1=()->System.out.println("Hellow");
		d1.message();
	}

}
