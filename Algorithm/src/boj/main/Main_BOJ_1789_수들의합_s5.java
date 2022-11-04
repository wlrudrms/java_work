package boj.main;

import java.util.Scanner;

public class Main_BOJ_1789_수들의합_s5 {
	public static void main(String[] args) {
		
		//1부터 더해서 그 값이 주어진 수보다
		//크거나 같아지면 수가 나올듯
		
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();
		sc.close();
		
		long i = 1;
		long sum = 0;
		while(true) {
			sum += i;
			i++;
			if(sum > S) {
				System.out.println(i-2);
				break;
			}
		}
	}
}
