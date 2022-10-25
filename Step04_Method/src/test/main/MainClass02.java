package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {

		/*
		 * 콘솔창에 "안녕하세요"를 출력하려고 한다.
		 * 
		 * 해당 목표를 달성하려면 콘솔창에 출력할 수 있는 기능을 가진 객체가 필요하다. System 클래스의 out이라는 static 필드에 해당
		 * 객체의 참조값이 들어있다. 이 객체의 type은 PrintStream type System, String 등의 클래스는 자바의
		 * java.lang 패키지에 있는 클래스이며 해당 패키지에 있는 모든 클래스는 import없이 사용할 수 있다.
		 */

		// 다중정의(overloading)된 println() 메소드 사용
		System.out.println("안녕하세요");
		System.out.println(999);
		System.out.println(true);
		System.out.println('a');

		// MyObject 객체의 다중정의된 메소드 사용해보기
		MyObject mo = new MyObject();
		mo.send();
		mo.send(1);
		mo.send("김구라");
		mo.send(new Car());
	}
}
