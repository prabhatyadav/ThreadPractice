package prabhat.practice.syncronize;

import prabhat.practice.syncronize.printEvenOdd.evenOddThreadPrint;

public class ThreadA extends Thread {

	public void run(){
	 	 //TODO : Increase the value of Count
		System.out.println("ThreadA before : "+ evenOddThreadPrint.count);
		evenOddThreadPrint.count++;
		System.out.println("ThreadA After : "+evenOddThreadPrint.count);
		super.run();
	}

}
