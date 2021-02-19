package prabhat.practice.syncronize;

public class ThreadMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA threadA= new ThreadA();
		ThreadB threadB= new ThreadB();
		 
		 threadA.start();
		 threadB.start();

	}

}
