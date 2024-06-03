package D0408.p15_3_3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		if (ts.add("Korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		} else {
			System.out.println("첫 번째 korea 추가 실패");

		}

		if (ts.add("china")) {
			System.out.println("첫 번째 china 추가 성공 ");
		} else {
			System.out.println("첫 번째 china 추가 실패 ");

		}
		if (ts.add("america")) {
			System.out.println("천 번째 america 추가 성공");
		} else {
			System.out.println("천 번째 america 추가 실패");
		}
		if (ts.add("china")) {
			System.out.println("두 번째 america 추가 성공");
		} else {
			System.out.println("두 번째 america 추가 실패");
		}
		System.out.println("Iterator로 전체 원소 순회 ------------");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
