package prabhat.practice.syncronize;

public class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...  :"+amount);

		if (this.amount < amount) {
			System.out.println("Less balance : "+this.amount+"; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(" Exception in withdraw : "+e.getMessage());
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...  Balance : "+this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit... amount : "+amount);
		this.amount += amount;
		System.out.println("deposit completed... Now Balance : "+this.amount);
		notify();
	}

}
