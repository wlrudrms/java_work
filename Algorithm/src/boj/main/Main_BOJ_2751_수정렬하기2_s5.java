package boj.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_BOJ_2751_수정렬하기2_s5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			nums.add(sc.nextInt());
		}

		Collections.sort(nums);

		for (Integer tmp : nums) {
			sb.append(tmp).append("\n");
		}
		System.out.println(sb);
	}
//	bufferedReader 사용법
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//
//		int length = Integer.parseInt(br.readLine());
//
//		ArrayList<Integer> numbers = new ArrayList<>();
//
//		for (int i = 0; i < length; i++)
//			numbers.add(Integer.parseInt(bufferReader.readLine()));
//
//		Collections.sort(numbers);
//
//		for (int number : numbers) {
//			stringBuilder.append(number).append('\n');
//		}
//		System.out.println(sb);
//	}

}
