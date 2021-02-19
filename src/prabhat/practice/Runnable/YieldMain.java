package prabhat.practice.Runnable;

public class YieldMain {

	public static void main(String[] args) {

         YieldExample yE = new YieldExample();
         Thread threadA = new Thread(yE);
         Thread threadB =new Thread(yE);


        // start the thread
         threadA.start();
         threadB.start();

	
	}

}
