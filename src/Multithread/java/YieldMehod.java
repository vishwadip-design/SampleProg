package Multithread.java;

public class YieldMehod extends Thread {

	public void run(){
		Thread.yield();
	 System.out.println("Subthread executed");
	}
	

}
