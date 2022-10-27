package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		// 자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 = new HandPhone();
		
		// 엄마 나도 SmartPhone이 갖고싶어
		
		// 엄마가 새로운 설명서를 가지고왔어 이지 그 폰은 SmartPhone이야
		//SmartPhone p2 = (SmartPhone)p1; >>안됨
		
		// 진짜? 엄마 고마워 나 이제 인터넷 할게
		//p2.doInternet(); 
	}
}
