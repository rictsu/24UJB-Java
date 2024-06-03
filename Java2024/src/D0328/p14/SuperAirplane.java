package D0328.p14;

public class SuperAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPER = 2;

	public int flyMode = NORMAL;

	public void fly() {
		if (flyMode == SUPER) {
			System.out.println("초음속 비행중...");
		} else {
			super.fly();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
