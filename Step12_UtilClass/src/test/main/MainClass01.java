package test.main;

import java.util.ArrayList;
import java.util.List;

/*
 *  java에서 배열은 크기를 조잘할 수 없는 고정 배열이다.
 *  따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면 일반 배열은 사용할 수 없다.
 *  그래서 해당 작업을 하려면 ArrayList 객체를 사용해야 한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String type을 저장할 수 있는 ArrayList 객체 생성
		List<String> names = new ArrayList<>();
		// "김구라", "해골", "원숭이" 3개의 String type을 저장해 보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		// 0번방의 아이템을 불러와서 item이라는 변수에 담아보세요.
		String item = names.get(0);
		// 1번방이 아이템을 삭제해 보세요.
		names.remove(1);
		// 0번방에 "에이콘"을 넣어 보세요.
		names.add(0, "에이콘"); // 덮어 씌우기 names.set(0, "에이콘");
		// 저장된아이템의 개수를 size라는 지역 변수에 담아 보세요.
		int size = names.size();
		// 저장된 모든 아이템 전체 삭제
		names.clear();
	}
}
