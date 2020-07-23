package B;

public class B extends A{
public void M1() {
	System.out.println("Overriding method");
}
public void M2() {
	System.out.println("M2 method");
}
public static void main(String[] args) {
	A a=new B();
	a.M1();
	
	
}
}
