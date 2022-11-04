package boj.main;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  feedback
 *  for문 안의 for문으로 누적합구한 사람도 있고
 *  피라미드 형식으로 생각해서 더해질 횟수만큼 곱해서 누적합을 구한 사람도있었다
 *  answer += (time.size()-i)*time.get(i);
 */
public class Main_BOJ_11399_ATM_s4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] time = new int[N];

		for (int i = 0; i < N; i++) {
			time[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(time);
		
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < N; i++) {
			sum += time[i];
			sum2 += sum;
		}
		System.out.println(sum2);
	}
}
