import prabhat.practice.yield.Racer;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racer racer = new Racer();
		
		Thread tortoiseRacer = new Thread(racer,"tortoise");
		Thread hearRacer = new Thread(racer,"hear");
		
		tortoiseRacer.start();
		hearRacer.start();
	}

}
