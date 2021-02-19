package prabhat.practice.incrementDecrement;

public class SumCalculateMultiThread {

	static int array[]  =  {1,2,3,4,5,6,7,8,9,10};
	static int counter;
	static int sum ;
	
	public static  synchronized int incCounter() {
		sum = sum+ array[counter];
		return counter++;
	}
	
	public static synchronized int decCounter() {
		return counter--;
	}
	
	public  static synchronized int getCounter() {
		return counter;
	}

	public static synchronized int sumvalue() { return sum; }

	public synchronized int sumTheArray() {
		 while(array.length > counter) {
			 int index = SumCalculateMultiThread.incCounter();
			 System.out.println(Thread.currentThread().getName() + " : " +index);
		 }
		 return sum;
	}
	
}
