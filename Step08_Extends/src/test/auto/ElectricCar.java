package test.auto;

public class ElectricCar extends Car{
	
	//부모 객체가 생성되기 위해서 필요한 객체를 자식 생성자의 생성자로 전달 받아서
	public ElectricCar(Engine engine) {
		//부모 생성자에 전달해 주어야 한다.
		super(engine);
		
	}
	
	public void charge() {
		System.out.println("충전중입니다.");
	}

}
