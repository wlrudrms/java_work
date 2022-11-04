package boj.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_BOJ_1110_더하기사이클_b1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		int num = scan.nextInt();
		ArrayList<Integer> me = new ArrayList<Integer>();
		me.add(num);
		
		int i = 0;
		while(true) {
			int a = me.get(i)/10;
			int b = me.get(i)%10;
			i++;
			int num2 = (a+b)%10+10*b;
			me.add(i, num2);
			if(me.get(0)==me.get(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
