package boj.main;

import java.util.*;

public class Main_BOJ_2588_곱셈_b3_2 {
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		
		//문자열 입력받기
		String str1 = sc1.next();
		String str2 = sc2.next();
		
		//배열 생성
		String arr1[] = new String[3];
		String arr2[] = new String[3];
		
		//문자열 나눠서 배열에 담기
		arr1 = str1.split("");
		arr2 = str2.split("");
		
		//정수배열로 바꾸기
		int[] nums1 = Arrays.asList(arr1).stream().mapToInt(Integer::parseInt).toArray();
		int[] nums2 = Arrays.asList(arr2).stream().mapToInt(Integer::parseInt).toArray();
		
		//문자열 숫자화
		int a = nums1[0]*100 + nums1[1]*10 + nums1[2];
		
		System.out.println(a*nums2[2]);
		System.out.println(a*nums2[1]);
		System.out.println(a*nums2[0]);
		
		int c = a*nums2[2] + 10*a*nums2[1] + 100*a*nums2[0];
		System.out.println(c);
	}
}
