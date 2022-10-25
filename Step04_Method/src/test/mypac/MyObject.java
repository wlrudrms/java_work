package test.mypac;

/*
 * [ 메소드를 만들 때 고려해야 하는 것 ]
 * 
 * 1. 접근 지정자
 * 2. static or non static
 * 3. 리턴 type
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자의 개수와 데이터 type
 */
public class MyObject {

	public void walk() {
		System.out.println("걸음을 걸어요");
	}

	public int getNumber() {
		return 10;
	}

	public String getGreeting() {
		return "안녕하세요";
	}
}
