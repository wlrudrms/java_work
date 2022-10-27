package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		//Phone클래스를 상속받은 HandPhone클래스로 객체를 생성해서 그 참조값을 p1이라는 이름의 지역변수에 담기
		HandPhone p1 = new HandPhone();
		/*
		 * HandPhone클래스의 생성자를 호출해서 객체를 생성했더니 Phone 클래스의 생성자도 호출되는걸 알 수 있다.
		 * 
		 * 따라서 HandPhone객체도 생성되고 Phone객체도 같이 생성되었다는걸 유추할 수 있다.
		 * 
		 * Phone 객체와 HandPhone객체가 생성되어서 같은 사물함에 들어간다.
		 * 
		 * 즉, 하나의 참조값으로 Phone의 기능, HandPhone의 기능을 모두 사용할 수 있다.
		 */
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}
}
