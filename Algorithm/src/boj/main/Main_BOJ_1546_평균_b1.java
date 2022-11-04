package boj.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main_BOJ_1546_평균_b1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] score = new double[N];

		for (int i = 0; i < N; i++) {
			score[i] = in.nextInt();
		}
		in.close();

		Arrays.sort(score);
		double M = score[N - 1];
		double[] fixed = new double[N];
		double avg = 0;

		for (int i = 0; i < N; i++) {
			fixed[i] = score[i] / M * 100;
			avg += fixed[i];
		}
		System.out.println((double) avg / N);

	}
}
