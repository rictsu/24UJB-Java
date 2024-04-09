package D0404BaseBall;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 랜덤 수 정하기.
		Random random = new Random();
		int[] str = new int[3];
		// 같은 수 나올 시 재시행.
		for (int i = 0; i < str.length; i++) {
			str[i] = random.nextInt(9)+1;
			for (int o = 0; o < i; o++) {
				if (str[i] == str[o]) {
					i--;
				}
			}
		}
		// 입력 값 저장 반복문.
		while (true) {
			System.out.println("Input number...");
			Scanner sc = new Scanner(System.in);
			int[] ch = new int[3];
			for (int k = 0; k < ch.length; k++) {
				ch[k] = sc.nextInt();

			}
			// 입력값과 비교 후 스트라이크 볼 갯수 카운트
			int strike = 0;
			int ball = 0;
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < ch.length; j++) {
					if (str[i] == ch[j] && i == j) {
						strike++;
					}
					if (str[i] == ch[j] && i != j) {
						ball++;
					}

				}
			}
			// 3스트라이크 게임 종료 조건문.
			if (strike == 3) {
				System.out.print("strike : " + strike + ", ");
				System.out.println("ball : " + ball);
				System.out.println("Game over!");
				break;
			}
			// 스트라이크 볼 갯수 알림.
			System.out.print("strike : " + strike + ", ");
			System.out.println("ball : " + ball);
		}
	}
}