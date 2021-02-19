package prabhat.practice.yield;

public class Racer implements Runnable {
	public static String winner;

	public void run() {
		this.race();
	}

	public void race() {
		for (int distance = 0; distance <= 100; distance++) {

			System.out.println("Distance COver by " + Thread.currentThread().getName() + "is " + distance + "Distance");

			boolean israceWon = this.isRaceWon(distance);
			if (distance == 30 && Thread.currentThread().getName().equals("hear")) {
				try {
					System.out.println(
							"Thread is Sleeping : " + Thread.currentThread().getName() + "huuurrrrrrrrrr.......");
					Thread.sleep(10 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (israceWon) {
				break;
			}
		}
	}

	private boolean isRaceWon(int totalDistanceCover) {
		boolean israceWon = false;

		if ((Racer.winner == null) && (totalDistanceCover == 100)) {
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			israceWon = true;
			System.out.println("Winner is " + Racer.winner);

		} else if (Racer.winner == null) {
			israceWon = false;
		} else if (Racer.winner == null) {
			israceWon = false;
		}
		return israceWon;
	}
}
