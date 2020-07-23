package Multithread.java;

public class MultithreadExample extends Thread{

	public void run()
	{
		System.out.println("Good Morning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MultithreadExample t=new MultithreadExample();
      t.start();
	
	}

}
