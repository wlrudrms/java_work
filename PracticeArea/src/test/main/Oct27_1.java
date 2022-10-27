package test.main;

import java.util.Random;

public class Oct27_1 {
	public static void main(String[] args) {
		String[] abc = { "a", "b", "c", "d", "e" };
		String[] a = new String[5];

		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			int r = ran.nextInt(5);
			a[i] = abc[r];
			System.out.print(abc[r]);
			if (i < 4) {
				System.out.print("|");
			}
		}
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i] != a[j]) {
					k++;
					
				}
			}
		}
		System.out.println();
		System.out.println(k+"개 동일");
		//잠시 포기하고 로또문제로 가보자
	}
}
