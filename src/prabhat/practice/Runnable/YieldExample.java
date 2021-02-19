package prabhat.practice.Runnable;

public class YieldExample implements Runnable {

	public void run() {
		//

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			if (i % 10 == 0) {
				System.out.println("before the yield()" + Thread.currentThread().getName());
				Thread.yield();
				System.out.println("after the yield()" + Thread.currentThread().getName());
			}
		}
	}

}
