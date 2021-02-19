package prabhat.practice.syncronize;

import prabhat.practice.syncronize.printEvenOdd.evenOddThreadPrint;

public class ThreadB extends Thread {

	@Override
	public void run() {
		// TODO Decrease the value of Count
		System.out.println("ThreadB before : "+ evenOddThreadPrint.count);
		evenOddThreadPrint.count--;
		System.out.println("ThreadB After : "+evenOddThreadPrint.count);
		super.run();
	}

}
