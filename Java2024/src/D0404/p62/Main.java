package D0404.p62;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.println("선택 번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (selectNumber[i] == selectNumber[j]) {
					i--;
				}
			}

		}
		for (int g = 0; g < 6; g++) {
			System.out.println(selectNumber[g] + " ");
		}
	}
}
//
//		int[] winningNumber = new int[6];
//		random = new Random(5);
//
//		System.out.println("당첨 번호 : ");
//		for (int i1 = 0; i1 < 6; i1++) {
//			winningNumber[i1] = random.nextInt(10) + 1;
//			System.out.println(winningNumber[i1] + " ");
//		}
//		System.out.println();
//		Arrays.sort(selectNumber);
//		Arrays.sort(winningNumber);
//		boolean result = Arrays.equals(selectNumber, winningNumber);
//		System.out.println("당첨 여부 : ");
//		if (result) {
//			System.out.println("축하합니다! 당첨 되셨습니다.");
//
//		} else {
//			System.out.println("당첨되지 않았습니다.");
//		}
//
//	}
//}