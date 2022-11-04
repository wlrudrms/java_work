package boj.main;

import java.util.Scanner;

public class Main_BOJ_2525_오븐시계_b3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dh = scan.nextInt();
		int dm = scan.nextInt();
		int c = scan.nextInt();
		
		int totalMin = dh * 60 + dm + c;
		int ansM = totalMin%60;
		
		int th = totalMin/60;
		
		
		if(th >= 24) {
			int ansH = th - 24;
			System.out.println(ansH+" "+ansM);
		} else {
			int ansH = th;
			System.out.println(ansH+" "+ansM);
		}
	}
}
