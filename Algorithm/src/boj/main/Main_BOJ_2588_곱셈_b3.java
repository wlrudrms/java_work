package boj.main;

import java.util.*;

 public class Main_BOJ_2588_곱셈_b3 {
 	public static void main(String[] args) {
 		
 		Scanner scan = new Scanner(System.in);
 		
 		int num1 = scan.nextInt();
 		int num2 = scan.nextInt();
 		
 		int num2_10 = num2%100;
 		int num2_1 = num2_10%10;
 		int num2_real10 =(num2_10 - num2_1)/10;
 		int a = num2/100;
 		
 		
 		System.out.println(num1*num2_1);
 		System.out.println(num1*num2_real10);
 		System.out.println(num1*a);
 		
 		int c = num1*num2_1 + num1*num2_real10*10 + num1*a*100;
 		System.out.println(c);
 	}
 }
