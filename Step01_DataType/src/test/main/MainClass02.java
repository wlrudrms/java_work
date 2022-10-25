package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어점수와 영어점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해보세요.
		double avg=(kor+eng)/2d;
		System.out.println(avg);
		//정확한 값을 구하려면 실수화시켜서 실수형 변수에 넣어야한다
	}
}
