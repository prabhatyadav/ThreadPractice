package prabhat.practice.incrementDecrement;

public class SumCalculateThread implements Runnable{
	 public void run() {
		 System.out.println(	new SumCalculateMultiThread().sumTheArray()); 
	 }

}
