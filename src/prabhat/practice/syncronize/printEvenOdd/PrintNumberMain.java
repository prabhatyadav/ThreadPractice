package prabhat.practice.syncronize.printEvenOdd;

public class PrintNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddThreadPrint newResource = new evenOddThreadPrint();

		Runnable evenRunnable = new Runnable() {public void run(){ newResource.evenNumber(); }};
		Runnable oddRunnable = new Runnable() {public void run(){
			newResource.oddNumber();
		}};
		
		Thread threadA= new Thread(oddRunnable);
		Thread threadB= new Thread(evenRunnable);
		 
		threadB.start();
		threadA.start();

	}

}
