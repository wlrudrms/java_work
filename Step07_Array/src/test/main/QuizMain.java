package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 1. run했을 때 cherry, apple, banana, melon,7 5개의 문자열 중에서 1개가 랜덤하게 출력되게
		 * 
		 * 2. run했을 때 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요
		 * 
		 * hint String[] items = {"cherry", "apple", "banana", "melon", "7"};
		 * Random ran = new Random(); 
		 * int ranNum = ran.nextint(5);
		 */
		String[] items = { "cherry", "apple", "banana", "melon", "7" };
		Random ran = new Random();
		int r1 = ran.nextInt(5);
		int r2 = ran.nextInt(5);
		int r3 = ran.nextInt(5);
		System.out.println(items[r1]);
		
	}
}
