package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는 walk(), getNumber(), getGreeting() 메소드를
		 * 차례로 호출해 보세요. 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담으세요.
		 */
		MyObject o1 = new MyObject();
		o1.walk();
		int num = o1.getNumber();
		String greet = o1.getGreeting();
		Car car = o1.getCar();
		// setNum(), setName(), useCar() 메소드를 호출해보세요

		// 메소드를 호출하면서 인자로 전달할 데이터를 즉석에서 만들어서 전달하기
		o1.setNum(1);
		o1.setName("김구라");
		o1.useCar(new Car());

		// 전달할 값이 들어있는 변수명으로 전달할 수 있다.
		int a = 999;
		String b = "누구게";
		Car c1 = new Car();
		o1.setNum(a);
		o1.setName(b);
		o1.useCar(c1);

		// doSomething() 메소드를 호출해보기
		o1.doSomething(a, b, c1);
	}
}
