package test.main;

import java.util.Random;

public class Oct27_2_Lotto {
	public static void main(String[] args) {
		// 당첨될 때까지 돌리기
		for (int k = 0; ; k++) {

			// 로또번호 생성
			Random ran = new Random();
			int[] myN = new int[6];

			for (int i = 0; i < 6; i++) {
				int r = ran.nextInt(1, 46);
				myN[i] = r;
				for (int j = 0; j < i; j++) {
					if (myN[i] == myN[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				System.out.print(myN[i] + " ");
			}

			System.out.println();

			// 당첨번호 생성
			int[] lotto = new int[6];

			for (int i = 0; i < 6; i++) {
				int r = ran.nextInt(1, 46);
				lotto[i] = r;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i] + " ");
			}

			System.out.println();

			// 비교
			int num = 0;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (myN[i] == lotto[j]) {
						num++;
						if (num == 6) {
							System.out.println("당첨!");
							return;
						}
					}
				}
			}
		}
	}
}
