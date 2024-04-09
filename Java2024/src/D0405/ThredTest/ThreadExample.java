package D0405.ThredTest;

public class ThreadExample {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("쌀");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}