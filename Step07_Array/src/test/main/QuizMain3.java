package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * 1. run했을 때 cherry, apple, banana, melon,7 5개의 문자열 중에서 1개가 랜덤하게 출력되게
		 * 
		 * 2. run했을 때 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요
		 * 
		 * 3. 점수 측정하기
		 */
		String[] items = { "cherry", "apple", "banana", "melon", "7" };
		Random ran = new Random();

		// for문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열객체 생성
		int[] nums = new int[3];

		for (int i = 0; i < 3; i++) {
			int r1 = ran.nextInt(5);
			System.out.print(items[r1]);
			if (i < 2) {
				System.out.print(" | ");
			}
			// 배열에 얻어낸 랜덤한 숫자를 저장하기
			nums[i] = r1;
		}
		// 개행
		System.out.println();

		// nums배열에 저장된 3개의 숫자가 모두 같은지 여부를 boolean type으로 얻어내기
		boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
		if (isEqual) {
			System.out.println("10점 입니다.");
		} else {
			System.out.println("0점 입니다.");
		}
	}
}
