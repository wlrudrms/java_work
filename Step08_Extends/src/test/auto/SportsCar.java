package test.auto;

public class SportsCar extends Car{

	public SportsCar(Engine engine) {
		super(engine);
	}
	
	public void openTop() {
		System.out.println("뚜껑을 열어요");
	}
	
	@Override
	public void drive() {
		System.out.println("더 빠르게 달려요.");
	}

}
