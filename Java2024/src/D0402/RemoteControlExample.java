package D0402;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc1 = new Audio();
		rc1.turnOn();
		rc1.turnOff();
		RemoteControl rc2 = new RemoteControl() {

			public void turnOn() {
				System.out.println("RemoteControl - turnOn()");
			}

			public void turnOff() {
				System.out.println("Remotecontrol - turnOff()");
			}

			public void setVolume(int volume) {

			}

		};
		rc2.turnOn();
		rc2.turnOff();
	}
}