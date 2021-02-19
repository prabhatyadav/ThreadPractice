package prabhat.practice.syncronize.printEvenOdd;

public class evenOddThreadPrint {
 public static int count;

 public synchronized void setCount(int count){
	 this.count=count;
 }

 // print the odd number
 public synchronized void oddNumber()
 {
	 while(count!=100) {

		 if(count%2!=0) {
			 System.out.println(Thread.currentThread().getName()+" : "+count);
			 try {
				 setCount(count++);
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 notify();

	 }
 }
 // print even number
 public void evenNumber() {

	 while(count!=100) {
		//notify();
		 if(count%2==0) {
			 System.out.println(Thread.currentThread().getName()+" : "+count);

			 try {
				 setCount(count++);
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 } notify();
	 }
 }

}
