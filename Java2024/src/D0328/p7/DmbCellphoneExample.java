package D0328.p7;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
		System.out.println("model : " + dmbCellphone.model);
		System.out.println("color : " + dmbCellphone.color);

		System.out.println("channel : " + dmbCellphone.channel);

		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요?");
		dmbCellphone.receiveVoice("안녕하세요. 홍길동 입니다");
		dmbCellphone.sendVoice("네, 반갑습니다");
		dmbCellphone.hangUp();

		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

	}

}
