package D0401;

public class PhoneExample {

	public static void main(String[] args) {
		Phone phone = new Phone("홍길동");
		Phone phone2 = new SmartPhone("임꺽정");
		phone2.turnOn();
		phone2.turnOff();

		SmartPhone smartPhone3 = new SmartPhone("홍길동");
		smartPhone3.turnOn();
		smartPhone3.internetSearch();
		smartPhone3.turnOff();
	}

}
