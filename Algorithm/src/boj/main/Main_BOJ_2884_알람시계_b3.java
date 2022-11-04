package boj.main;

import java.util.Scanner;

public class Main_BOJ_2884_알람시계_b3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();

		if (h != 0 && m >= 45) {
			int fh = h;
			int fm = m - 45;
			System.out.println(fh + " " + fm);
		} else if (h != 0 && m < 45) {
			int fh = h - 1;
			int fm = 15 + m;
			System.out.println(fh + " " + fm);
		} else if (h == 0 && m >= 45) {
			int fh = 0;
			int fm = m - 45;
			System.out.println(fh + " " + fm);
		} else if (h == 0 && m < 45) {
			int fh = 23;
			int fm = 15 + m;
			System.out.println(fh + " " + fm);
		}
	}
	
	/*
	 * feedback 토탈 min을 활용하면 하나의 if문으로 풀이 가능
	 */
}
