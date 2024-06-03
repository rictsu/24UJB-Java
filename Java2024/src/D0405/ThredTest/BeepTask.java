package D0405.ThredTest;

public class BeepTask implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("보리");
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
			}
		}
	}
}