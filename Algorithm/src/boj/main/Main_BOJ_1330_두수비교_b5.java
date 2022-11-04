package boj.main;

import java.util.Scanner;

public class Main_BOJ_1330_두수비교_b5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if (n1>n2) {
			System.out.println(">");
		} else if(n1<n2) {
			System.out.println("<");
		} else if(n1 == n2) {
			System.out.println("==");
		}
		
	}
}
