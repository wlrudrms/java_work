package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 다음과 같이 프로그래밍 해보세요
		 * 검색할 단어를 입력하세요 : house
		 * house의 뜻은 집입니다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요:");
		String word = scan.next();
		System.out.println(word+"의 뜻은 "+dic.get(word)+"입니다.");
		
	}
}
