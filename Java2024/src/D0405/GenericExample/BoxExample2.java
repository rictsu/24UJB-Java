package D0405.GenericExample;

public class BoxExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<String> box1 = new Box2<String>();
		box1.set("홍길동");
		String str = box1.get();
		System.out.println(str);

		Box2<Integer> box3 = new Box2<Integer>();
		box3.set(6);
		int value = box3.get();
		System.out.println(value);
	}

}
