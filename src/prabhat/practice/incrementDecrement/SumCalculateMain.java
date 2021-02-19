package prabhat.practice.incrementDecrement;

public class SumCalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumCalculateThread sumCalculateThread = new SumCalculateThread();
		Thread t = new Thread(sumCalculateThread);
		Thread t1 = new Thread(sumCalculateThread);
		t.start();
		t1.start();
		
	}

}
