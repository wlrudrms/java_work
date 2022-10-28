package boj.main;

import java.util.Scanner;

public class Main_BOJ_3003_킹퀸룩_b5 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int arr[] = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] - scan.nextInt();
			System.out.print(arr[i] + " ");
		}
	}
}
