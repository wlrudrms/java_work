package test.main;

import test.auto.ElectricCar;
import test.auto.Engine;

public class MainClass07 {
	public static void main(String[] args) {
		// 생성자의 매개변수로 Engine객체를 전달하면서 ElectricCar객체 생성
		ElectricCar car1 = new ElectricCar(new Engine());
		car1.drive();
		car1.charge();
		
	}
}
