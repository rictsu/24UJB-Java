package D0408.p15_4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);

		System.out.println("총 entry의 수 : " + map.size());

	}

}
