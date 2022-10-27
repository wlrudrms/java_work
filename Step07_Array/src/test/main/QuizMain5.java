package test.main;

import java.util.Random;

public class QuizMain5 {
	public static void main(String[] args) {
		/*
		 * 3개 10점 2개 5점
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

		// 3개가 같은지 여부
		boolean isAllEqual = nums[0] == nums[1] && nums[1] == nums[2];
		// 2개가 같은지 여부
		boolean isTwoEqual = nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2];

		if (isAllEqual) {
			System.out.println("10점 입니다.");
		} else if (isTwoEqual) {
			System.out.println("5점 입니다.");
		} else {
			System.out.println("0점 입니다.");
		}
	}
}
