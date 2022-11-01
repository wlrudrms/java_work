package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
	public static void main(String[] args) {
		// sample 데이터
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");

		/*
		 * 검색할 단어를 입력하세요:house
		 * house 의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요:gura
		 * gura 는 목록에 없습니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 단어를 입력하세요(종료=>q):");
			String word = scan.nextLine(); //한줄 입력하고 개행할때까지 실행을 멈추게 함
			// 입력받은 단어를 Map 의 key 값으로 활용해서 value 값을 읽어와 본다.
			// 해당 key 값으로 저장된 value 가 없을수도 있다...
			if(word.equals("q")) {
				break;
			}
			// 해당 key 값의 존재여부를 알아낸다
			boolean isExist = dic.containsKey(word);
			if (!isExist) {// 만일 찾는 단어가 없으면
				System.out.println(word + "는 목록에 없습니다.");
			} else {// 찾는 단어가 있으면
				//해당 key 값으로 저장된 value값을 읽어온다.
				String mean = dic.get(word);
				System.out.println(word + "의 뜻은 " + mean + "입니다.");
			}
		}
	}
}
