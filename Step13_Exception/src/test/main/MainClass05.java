package test.main;

import java.util.Random;

import test.mypac.WowException;

//예외 클래스를 생성해서 적절한 시점에 예외클래스를 throw하며 사용할 줄 알아야한다.
public class MainClass05 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		//0~4의 랜덤정수 얻어내기
		int ranNum = ran.nextInt(5);
		
		//가장 큰 수가 나오면 WowException을 발생시키기
		if(ranNum==4) {
			//throw 예약어와 함께 예외 객체를 생성하면 예외가 발생한다.
			throw new WowException("놀랍네 이거");
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
