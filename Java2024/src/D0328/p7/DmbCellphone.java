package D0328.p7;

public class DmbCellphone extends CellPhone {
	int channel;

	DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("channel " + channel + "번 방송 수신 시작");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "번으로 변경");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신 종료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
