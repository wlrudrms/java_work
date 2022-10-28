package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");
			}
		});
		
		// interface에서 override할 메소드가 하나인 경우 아래와같이 Drill type 데이터를 얻어올 수 있다.
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어요");
		});
		
		//ArrayList 
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}
