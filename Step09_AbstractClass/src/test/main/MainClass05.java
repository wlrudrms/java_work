package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
	// 필드를 선언하면서 값 얻어내서 대입하는 코드
	int num = 999;
	String name = "kim";
	Scanner scan = new Scanner(System.in);
	// 필드는 선언만 하면 기본값이 들어 간다.
	int weight; // 0
	boolean isRun; // false
	String msg; // null
	Scanner scan2; // null
	// static 영역에 올리고 싶은 필드는 static 예약어를 이용해서 만든다.
	static String greet = "안녕";
	// Anonymous Inner Class를 이용해서 Weapon type의 참조값 얻어내기
	static Weapon w1 = new Weapon() {
		@Override
		public void attack() {
			System.out.println("무엇인지 모르겠지만 공격하자");
		}
	};

	public static void main(String[] args) {
		// 1. 메소드 호출하면서 static 필드에 미리 준비된 값을 전달하기
		useWeapon(w1);
		// Anonymous Local Inner Class를 이용해서 Weapon type의 참조값 얻어내기
		Weapon w2 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격하기");
			}
		};
		// 2. 메소드 호출하면서 지역변수에 미리 준비된 값을 전달하기
		useWeapon(w2);

		// 매개변수에 바로 Anonymous Class를 이용해서 Weapon type의 참조값 얻어내기
		// 3. 메소드를 호출하면서 값을 즉석에서 만들어서 전달하기
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				System.out.println("새롭게 공격하기");
			}
		});
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
