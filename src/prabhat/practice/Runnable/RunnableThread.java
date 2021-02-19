package prabhat.practice.Runnable;
import java.lang.*;

public class RunnableThread  implements Runnable{

	 public void run(){
		 for(int i=0;i<10;i++){
		System.out.println("Hi this is the First Runnable Interface Thread");
		 }
		 }
	
	
	public static void main(String[] args) {
		
		RunnableThread runnableObject = new RunnableThread() ;
		  Thread runnableThread = new Thread(runnableObject);
		  runnableThread.start();
	}

}
