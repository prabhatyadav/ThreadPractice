package prabhat.practice.yield;

public class YeildRunnable implements Runnable {
	public void run() {
		System.out.println("current Thread " + Thread.currentThread().getName() + " Priority : "
				+ Thread.currentThread().getPriority());
		Thread.yield();
		System.out.println("current Thread " + Thread.currentThread().getName() + " Priority : "
				+ Thread.currentThread().getPriority() + " ENd");
	}
}
