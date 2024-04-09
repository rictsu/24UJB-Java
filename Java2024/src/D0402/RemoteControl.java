package D0402;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	static void changebattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
