package D0328.p7;

public class CellPhone {
	String model;
	String color;

	void powerOn() {
		System.out.println("Power On");
	}

	void powerOff() {
		System.out.println("Power Off");
	}

	void bell() {
		System.out.println("Bell ring");
	}

	void sendVoice(String message) {
		System.out.println("Send Message : " + message);
	}

	void receiveVoice(String message){
		System.out.println("Receive Message : "+message);
	}

	void hangUp() {
		System.out.println("Hang Up");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
