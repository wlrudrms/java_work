package test.mypac;

/*
 * class의 역할
 * 1. 객체의 설계도 역할
 * 2. data type 역할
 * 3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	// 저장소(field)
	public String name;

	// 달리는 기능(method)
	public void drive() {
		/*
		 * 이 클래스로 객체가 생성이 된다면 그 객체의 참조값을 가리키는 예약어가 this이다.
		 */
		System.out.println(this.name + " 이(가) 달려요!");
	}

	// 멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요!");
	}
}
