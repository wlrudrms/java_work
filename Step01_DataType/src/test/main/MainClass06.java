package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//지역변수는 값을 넣지않고 선언만하면 만들어지지 않는다.
		int num1;
		String name1;
		
		//아직 만들어지지 않았기 때문에 num1은 참조불가
		//int result=10+num1;
		
		//아직 만들어지지 않았기 때문에 name1은 참조불가
		//System.out.println("name1:"+name1);
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
