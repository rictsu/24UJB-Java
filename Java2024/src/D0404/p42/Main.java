package D0404.p42;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동&이수홍,박연수,김자바-Simon";

		String[] names = text.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
