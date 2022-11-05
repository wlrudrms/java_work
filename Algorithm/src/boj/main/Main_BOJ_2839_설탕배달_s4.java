package boj.main;

import java.util.Scanner;

public class Main_BOJ_2839_설탕배달_s4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		/*
		 * 5로 나눈 나머지가 1이면 6을 3으로담고 2이면 12 3이면 3 4이면 9 15보다 작은수 중에서 4,7 은 -1 출력
		 */
		int Q = N / 5;
		int R = N % 5;

		if (N == 4 || N == 7) {
			System.out.println(-1);
		} else if (R == 0) {
			System.out.println(Q);
		} else if (R == 1) {
			System.out.println(Q + 1);
		} else if (R == 2) {
			System.out.println(Q + 2);
		} else if (R == 3) {
			System.out.println(Q + 1);
		} else if (R == 4) {
			System.out.println(Q + 2);
		}

		sc.close();
	}
}

//다른풀이 while문 안에서 나누기 5 빼기3 반복실행
//
//while (true) {
//	if (N % 5 == 0) {
//		result += N / 5;
//		break;
//	} else {
//		N -= 3;
//		result++;
//	}
//
//	if (N < 0) {
//		result = -1;
//		break;
//	}
//}
