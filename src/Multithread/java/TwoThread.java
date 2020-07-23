package Multithread.java;

public class TwoThread extends Thread{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TwoThread t1=new TwoThread()
		{
			public void run()
			{
			System.out.println("Thread First");
		    }
		};
		TwoThread t2=new TwoThread()
		{
			public void run() {
				System.out.println("Thread two");
			                  }
		};
		t1.start();
		t2.start();
	}

}
